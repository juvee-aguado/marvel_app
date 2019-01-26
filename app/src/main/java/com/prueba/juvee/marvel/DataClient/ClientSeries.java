package com.prueba.juvee.marvel.DataClient;

import com.prueba.juvee.marvel.Objetos.Series.ResultadoSeries;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ClientSeries {
    @GET("series")
    Call<ResultadoSeries> getFilter(
            @Query("apikey") String apikey,
            @Query("ts") String ts,
            @Query("hash") String hash,
            @Query("orderBy") String orderBy,
            @Query("limit") String limit,
            @Query("titleStartsWith") String nameStartsWith
    );

    @GET("series")
    Call<ResultadoSeries> getAll(
            @Query("apikey") String apikey,
            @Query("ts") String ts,
            @Query("hash") String hash,
            @Query("orderBy") String orderBy,
            @Query("limit") String limit
    );
}
