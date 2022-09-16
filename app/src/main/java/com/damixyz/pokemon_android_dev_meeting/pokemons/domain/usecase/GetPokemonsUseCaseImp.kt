package com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase

import com.damixyz.pokemon_android_dev_meeting.pokemons.data.PokemonRepository
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.PokemonScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.ScreenState
import javax.inject.Inject

class GetPokemonsUseCaseImp @Inject constructor(val repository: PokemonRepository) :
    GetPokemonsUseCase {
    override suspend fun execute(): ScreenState {
        return try {
            val list = repository.getPokemons()
            if (list.isEmpty()) {
                ScreenState.Empty
            } else {
                PokemonScreenState.Content(payload = list)
            }
        } catch (cause: Throwable) {
            ScreenState.Error(errorMessages = cause.message ?: "Unknown Error")
        }
    }
}