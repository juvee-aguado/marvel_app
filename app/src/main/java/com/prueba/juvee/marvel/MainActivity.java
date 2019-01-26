package com.prueba.juvee.marvel;


import android.Manifest;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.prueba.juvee.marvel.Fragmentos.ComicsFragment;
import com.prueba.juvee.marvel.Fragmentos.PersonajesFragment;
import com.prueba.juvee.marvel.Fragmentos.SeriesFragment;
import com.prueba.juvee.marvel.Utilidades.UtilidadesNetwork;
import com.prueba.juvee.marvel.VariablesGlobales.Variables;



public class MainActivity extends AppCompatActivity  {


    private static final String LOG_TAG = "SMSReceiver";
    public static final int NOTIFICATION_ID_RECEIVED = 0x1221;
    static final String ACTION = "android.net.conn.CONNECTIVITY_CHANGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter(ACTION);
        this.registerReceiver(mReceivedSMSReceiver, filter);

        initComponents();
    }

    private void displayAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder
                .setMessage(getString(R.string.no_conexion))
                .setCancelable(false)
                .setPositiveButton(getString(R.string.ok),
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                        finish();
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    private final BroadcastReceiver mReceivedSMSReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            int status = UtilidadesNetwork.getConnectivityStatusString(context);
            if("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (status == UtilidadesNetwork.NETWORK_STATUS_NOT_CONNECTED) {
                    displayAlert();
                }
            }

        }
    };
    private void initComponents() {
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_personajes);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            Variables.query="";
            switch (item.getItemId()) {
                case R.id.navigation_personajes:
                    fragment = new PersonajesFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_comics:
                    fragment = new ComicsFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_series:
                    fragment = new SeriesFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
