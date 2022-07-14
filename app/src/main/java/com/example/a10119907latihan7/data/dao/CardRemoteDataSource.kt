package com.example.a10119907latihan7.data.dao

import com.example.a10119907latihan7.domain.dto.CardResponse
import retrofit2.Response
import retrofit2.http.GET

// 7/14/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
interface CardRemoteDataSource {
    @GET("/api/v7/cardinfo.php?type=normal%20monster")
    suspend fun fetch(): Response<CardResponse>
}