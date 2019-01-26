package com.prueba.juvee.marvel.Fragmentos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.prueba.juvee.marvel.Adaptadores.ComicsAdaptador;
import com.prueba.juvee.marvel.Objetos.Comics.Result;
import com.prueba.juvee.marvel.Objetos.Comics.ResultadoComic;
import com.prueba.juvee.marvel.R;
import com.prueba.juvee.marvel.VariablesGlobales.Variables;

import com.prueba.juvee.marvel.DataClient.ClientComics;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ComicsFragment extends Fragment implements ComicsAdaptador.ItemClickListener{

    ComicsAdaptador adapter;

    List<Result> data = new ArrayList<>();;
    RecyclerView recyclerView;
    boolean isLoading = false;
    FloatingActionButton floatingActionButton;
    GridLayoutManager glm;
    MaterialEditText met;

    public static ComicsFragment newInstance() {
        ComicsFragment fragment = new ComicsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_comics, container, false);
        recyclerView = v.findViewById(R.id.rcv_personajes);
        glm  = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(glm);


        ImageButton btn_search = v.findViewById(R.id.btn_search);
        met = v.findViewById(R.id.search_view);

        floatingActionButton =  v.findViewById(R.id.floatingActionButton);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Integer.parseInt(view.getTag().toString())==0){
                    floatingActionButton.setImageResource(R.drawable.ic_sort_reverse);
                    view.setTag("1");
                    Variables.orderComics="-title";
                    loadJSON();

                }else{
                    floatingActionButton.setImageResource(R.drawable.ic_sort_by_alphabet);
                    view.setTag("0");
                    Variables.orderComics="title";
                    loadJSON();
                }

            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Variables.query = met.getText().toString();

                if(met.getText().toString().isEmpty()){
                    return;
                }

                hideKeyboardFrom(getActivity().getApplicationContext(),met);
                loadJSON();

            }
        });

        hideKeyboardFrom(getActivity().getApplicationContext(),met);

        met.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(v.getText().toString().isEmpty()){
                    return false;
                }
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    Variables.query = v.getText().toString();
                    loadJSON();
                    hideKeyboardFrom(getActivity().getApplicationContext(),met);
                    return true;
                }
                return false;
            }
        });


        loadJSON();
        return v;
    }

    public static void hideKeyboardFrom(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


    private void loadJSON(){

        if(data!=null) {
            data.clear();
        }
        if(adapter!=null) {
            adapter.notifyDataSetChanged();
        }

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gateway.marvel.com:443/v1/public/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        ClientComics restClient =retrofit.create(ClientComics.class);

        Call<ResultadoComic> call;

        if(Variables.query.equals("")) {
            call= restClient.getAllComics(Variables.apikey,Variables.ts,Variables.hash,Variables.orderComics,Variables.limit);
        }else{
            call= restClient.getFilterComics(Variables.apikey,Variables.ts,Variables.hash,Variables.orderComics,Variables.limit,Variables.query);
        }

        call.enqueue(new Callback<ResultadoComic>() {
            @Override
            public void onResponse(Call<ResultadoComic> call, Response<ResultadoComic> response) {
                switch (response.code()) {
                    case 200:

                        //view.notifyDataSetChanged(data.getResults());
                        Log.e("DATA",response.body().getData().getCount()+"");

                        if(response.body().getData().getResults().isEmpty()){
                            Toast.makeText(getActivity().getApplicationContext(),getString(R.string.not_found),Toast.LENGTH_LONG).show();
                        }
                        data.clear();
                        data =response.body().getData().getResults();
                        adapter = new ComicsAdaptador(getActivity().getApplicationContext(),data);
                        adapter.setClickListener(ComicsFragment.this);
                        recyclerView.setAdapter(adapter);
                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<ResultadoComic> call, Throwable t) {
                Log.e("error", t.toString());
            }
        });
    }

    @Override
    public void onItemClick(View view, int position) {

    }
}