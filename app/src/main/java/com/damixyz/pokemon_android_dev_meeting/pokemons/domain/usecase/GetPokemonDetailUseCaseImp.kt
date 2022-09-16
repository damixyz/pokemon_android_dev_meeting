package com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase

import com.damixyz.pokemon_android_dev_meeting.pokemons.data.PokemonRepository
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.PokemonDetailsScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.ScreenState
import javax.inject.Inject

class GetPokemonDetailUseCaseImp @Inject constructor(private val repository: PokemonRepository) :
    GetPokemonDetailUseCase {
    override suspend fun execute(pokemonId: Int): ScreenState {
        return try {
            val pokemonDetail = repository.getPokemonDetails(pokemonId = pokemonId)
            PokemonDetailsScreenState.Content(payload = pokemonDetail)

        } catch (cause: Throwable) {
            ScreenState.Error(errorMessages = cause.message ?: "Unknown Error")
        }
    }
}