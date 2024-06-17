package com.example.jbmatrix.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
private const val baseUrl = "https://jbmatrix.in/dev33/duaremart/api/"
    val retrofit:Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService:ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}
