package com.example.newshub.api;

import com.example.newshub.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("v2/everything")
    Call<News> getNews(@Query("q") String newsAbout, @Query("from") String dataFrom, @Query("sortBy") String sortBty, @Query("apiKey") String apiKey);
}

