package com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase

import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.ScreenState

interface GetPokemonsUseCase {
    suspend fun execute(): ScreenState
}