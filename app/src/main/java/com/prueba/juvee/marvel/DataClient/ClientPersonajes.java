package com.prueba.juvee.marvel.DataClient;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import com.prueba.juvee.marvel.Objetos.Personajes.Resultado;

public interface ClientPersonajes {

    @GET("characters")
    Call<Resultado> getFilterChars(
            @Query("apikey") String apikey,
            @Query("ts") String ts,
            @Query("hash") String hash,
            @Query("orderBy") String orderBy,
            @Query("limit") String limit,
            @Query("nameStartsWith") String nameStartsWith
    );

    @GET("characters")
    Call<Resultado> getAll(
            @Query("apikey") String apikey,
            @Query("ts") String ts,
            @Query("hash") String hash,
            @Query("orderBy") String orderBy,
            @Query("limit") String limit
    );





}
