package com.generation.projeto0606.api

import com.generation.projeto0606.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.Lazy as lazy

object RetrofitInstance {

    private  val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}