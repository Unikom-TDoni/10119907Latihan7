package com.example.a10119907latihan7.data

import com.example.a10119907latihan7.data.dao.CardRemoteDataSource
import com.example.a10119907latihan7.domain.entitiy.Card
import com.example.a10119907latihan7.domain.dto.CardResponse
import com.example.a10119907latihan7.module.ErrorResponse
import com.example.a10119907latihan7.module.FlowApiBuilder
import com.example.a10119907latihan7.module.Repository
import com.example.a10119907latihan7.module.RetrofitBuilder

// 7/14/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
class CardRepository : Repository() {

    private val cardRemoteDataSource = RetrofitBuilder.buildService(CardRemoteDataSource::class.java)

    fun fetch() =
        FlowApiBuilder<Collection<Card>, ErrorResponse, CardResponse>()
            .setApiCall { cardRemoteDataSource.fetch() }
            .setDefaultErrorResponseInstance(ErrorResponse())
            .setManageApiSuccessResponse {
                it.toCards()
            }
            .setManageApiErrorResponse { onApiResponseError(it) }
            .setCoroutineContext(defaultDispatcher).build()
}