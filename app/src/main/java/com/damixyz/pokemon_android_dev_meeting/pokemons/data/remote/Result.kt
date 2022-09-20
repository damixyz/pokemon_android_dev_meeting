package com.damixyz.pokemon_android_dev_meeting.pokemons.data.remote


import com.squareup.moshi.Json

data class Result(
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val url: String
)
