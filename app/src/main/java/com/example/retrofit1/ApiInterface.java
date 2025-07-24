package com.example.retrofit1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("/posts/1")
    Call<ResponseData> getData();
}
