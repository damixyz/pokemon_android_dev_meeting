package com.damixyz.pokemon_android_dev_meeting.pokemons.data.remote

import com.damixyz.pokemon_android_dev_meeting.BuildConfig
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.model.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApi {
    @GET(BuildConfig.END_POINT)
    suspend fun getPokemon():PokemonData

    @GET("${BuildConfig.END_POINT}{id}")
    suspend fun getPokemonDetails(@Path("id") id: Int): Pokemon
}