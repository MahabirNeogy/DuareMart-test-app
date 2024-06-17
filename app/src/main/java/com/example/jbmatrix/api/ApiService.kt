package com.example.jbmatrix.api

import com.example.jbmatrix.data.ApiResponse
import com.example.jbmatrix.data.Product
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.Call


interface ApiService {
    @FormUrlEncoded
    @POST("maincategory_products")
    fun getProducts(
        @Header("keydata") keydata: String,
        @Field("category_id") categoryId: String
    ):Call<ApiResponse>
}