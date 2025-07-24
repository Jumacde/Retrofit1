package com.example.retrofit1;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance implements RetrofitInstance_interface{
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com//";
    private static Retrofit retrofit;

    public RetrofitInstance() {

    }

    // getter
    @Override
    public Retrofit getRetrofit() {
        return null;
    }

    // setter
    @Override
    public void setRetrofit(Retrofit retrofit) {

    }

    // method
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(
                            GsonConverterFactory
                                    .create()
                    )
                    .build();
        }
        return retrofit;
    }

    public static ApiInterface getApiInterface() {
        return getRetrofitInstance().create(ApiInterface.class);
    }

}
