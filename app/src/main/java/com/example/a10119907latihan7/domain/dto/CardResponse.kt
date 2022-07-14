package com.example.a10119907latihan7.domain.dto

import com.example.a10119907latihan7.domain.entitiy.Card

// 7/14/2022
// 10119907
// T DONI INDRAPRASTA PRADANA
// IF10K
data class CardResponse(
    val data: Collection<Data>
) {
    data class Data(
        val atk: Int,
        val attribute: String,
        val card_images: Collection<CardImage>,
        val def: Int,
        val desc: String,
        val level: Int,
        val name: String,
        val race: String,
    )

    data class CardImage(
        val image_url: String,
    )

    fun toCards(): Collection<Card> =
        data.map {
            Card(
                it.atk,
                it.attribute,
                it.card_images.first().image_url,
                it.def,
                it.desc,
                it.level,
                it.name,
                it.race,
            )
        }
}