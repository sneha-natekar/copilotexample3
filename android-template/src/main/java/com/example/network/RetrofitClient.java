package com.example.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    // Base URL for the API
    private static final String BASE_URL = "https://api.example.com/";
    // Retrofit instance
    private static Retrofit retrofit = null;

    // Method to get the Retrofit client instance
    public static Retrofit getClient() {
        if (retrofit == null) {
            // Create a new Retrofit instance if it doesn't exist
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
