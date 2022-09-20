package com.damixyz.pokemon_android_dev_meeting.pokemons.data.remote


import com.squareup.moshi.Json

data class PokemonData(
    @Json(name = "count")
    val count: Int,
    @Json(name = "next")
    val next: String,
    @Json(name = "previous")
    val previous: Any,
    @Json(name = "results")
    val results: List<Result>
)
