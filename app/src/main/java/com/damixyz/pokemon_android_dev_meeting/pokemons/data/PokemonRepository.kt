package com.damixyz.pokemon_android_dev_meeting.pokemons.data

import com.damixyz.pokemon_android_dev_meeting.pokemons.data.remote.PokemonApi
import com.damixyz.pokemon_android_dev_meeting.pokemons.data.remote.PokemonData
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.model.Pokemon
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PokemonRepositoryImp @Inject constructor(
    private val service: PokemonApi,
) : PokemonRepository {
    override suspend fun getPokemons(): List<Pokemon> {
        return pokemonMapper(service.getPokemon())
    }

    override suspend fun getPokemonDetails(pokemonId: Int) =
        service.getPokemonDetails(id = pokemonId)

    private fun pokemonMapper(pokemonData: PokemonData): List<Pokemon> {
        return pokemonData.results.map {
            Pokemon(
                name = it.name,
                id = getIdFromUrl(it.url)
            )
        }
    }

    private fun getIdFromUrl(url: String): Int {
        val id = url.substring(
            url.lastIndexOf("/", url.length - 2, true),
            url.length - 1
        )

        return id.substring(1).toInt()
    }
}

interface PokemonRepository {
    suspend fun getPokemons(): List<Pokemon>
    suspend fun getPokemonDetails(pokemonId: Int): Pokemon
}
