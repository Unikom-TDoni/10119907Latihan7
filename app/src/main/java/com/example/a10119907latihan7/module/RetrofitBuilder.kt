package com.example.a10119907latihan7.module

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// 7/14/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
object RetrofitBuilder {
    private const val BASE_URL = "https://db.ygoprodeck.com"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildService(service: Class<T>): T =
        retrofit.create(service)
}