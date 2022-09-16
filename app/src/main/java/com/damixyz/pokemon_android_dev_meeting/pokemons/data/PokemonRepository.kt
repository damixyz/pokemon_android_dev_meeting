package com.damixyz.pokemon_android_dev_meeting.pokemons.data

import com.damixyz.pokemon_android_dev_meeting.pokemons.data.remote.PokemonApi
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.model.Pokemon
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonRepositoryImp @Inject constructor(
    private val service: PokemonApi,
) : PokemonRepository {
    override suspend fun getPokemons(): List<Pokemon> = service.getPokemon()

    override suspend fun getPokemonDetails(pokemonId: Int) =
        service.getPokemonDetails(id = pokemonId)
}

interface PokemonRepository {
    suspend fun getPokemons(): List<Pokemon>
    suspend fun getPokemonDetails(pokemonId: Int): Pokemon
}
