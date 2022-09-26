package com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase

import com.damixyz.pokemon_android_dev_meeting.pokemons.data.PokemonRepository
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.PokemonScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.ScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.model.Pokemon
import javax.inject.Inject

class GetPokemonsUseCaseImp @Inject constructor(private val repository: PokemonRepository) :
    GetPokemonsUseCase {
    override suspend fun execute(): ScreenState {
        return try {
//            val list = repository.getPokemons()
            val list =  emptyList<Pokemon>()
            if (list.isEmpty()) {
                ScreenState.Empty(emptyMessage = "List was empty")
            } else {
                PokemonScreenState.Content(payload = list)
            }
        } catch (cause: Throwable) {
            ScreenState.Error(errorMessages = cause.message ?: "Unknown Error")
        }
    }
}