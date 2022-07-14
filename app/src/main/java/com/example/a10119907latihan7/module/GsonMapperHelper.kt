package com.example.a10119907latihan7.module

import java.io.Reader
import com.google.gson.Gson
import java.lang.reflect.Type

// 7/14/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
object GsonMapperHelper {
    private val gson = Gson()

    fun mapToJson(dto: Any): String = gson.toJson(dto)

    fun <T> mapToDto(json: Reader?, kotlinClass: Class<T>): T? = gson.fromJson(json, kotlinClass)

    fun <T> mapStringToDto(json: String?, kotlinClass: Class<T>): T? =
        gson.fromJson(json, kotlinClass)

    fun <T> mapStringToDtoCollection(json: String?, type: Type): T? = gson.fromJson(json, type)
}