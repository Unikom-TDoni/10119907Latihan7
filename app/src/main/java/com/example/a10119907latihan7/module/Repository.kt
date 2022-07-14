package com.example.a10119907latihan7.module

import kotlinx.coroutines.Dispatchers
import okhttp3.ResponseBody

// 7/14/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
abstract class Repository {
    protected val defaultDispatcher = Dispatchers.IO

    protected fun onApiResponseError(responseBody: ResponseBody) =
        GsonMapperHelper.mapToDto(
            responseBody.charStream(),
            ErrorResponse::class.java
        )
}