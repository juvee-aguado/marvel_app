package com.prueba.juvee.marvel.DataClient;

import com.prueba.juvee.marvel.Objetos.Comics.ResultadoComic;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ClientComics {

    @GET("comics")
    Call<ResultadoComic> getFilterComics(
            @Query("apikey") String apikey,
            @Query("ts") String ts,
            @Query("hash") String hash,
            @Query("orderBy") String orderBy,
            @Query("limit") String limit,
            @Query("titleStartsWith") String nameStartsWith
    );

    @GET("comics")
    Call<ResultadoComic> getAllComics(
            @Query("apikey") String apikey,
            @Query("ts") String ts,
            @Query("hash") String hash,
            @Query("orderBy") String orderBy,
            @Query("limit") String limit
    );
}
