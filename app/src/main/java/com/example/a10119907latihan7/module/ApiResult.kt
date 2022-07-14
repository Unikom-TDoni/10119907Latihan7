package com.example.a10119907latihan7.module

// 7/14/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
sealed class ApiResult<out TSuccess, out TError> {
    class Loading<out TSuccess, out TError> : ApiResult<TSuccess, TError>()
    data class Error<out TSuccess, out TError>(val response: TError) : ApiResult<TSuccess, TError>()
    data class Success<out TSuccess, out TError>(val response: TSuccess) : ApiResult<TSuccess, TError>()
}