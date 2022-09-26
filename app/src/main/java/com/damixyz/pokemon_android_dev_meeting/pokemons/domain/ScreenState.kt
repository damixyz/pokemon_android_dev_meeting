package com.damixyz.pokemon_android_dev_meeting.pokemons.domain

import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.model.Pokemon

sealed class ScreenState {
    data class Loading(val isLoading: Boolean) : ScreenState()
    data class Error(val errorMessages: String) : ScreenState()
    data class Empty(val emptyMessage: String?) : ScreenState()
}

sealed class PokemonScreenState : ScreenState() {
    data class Content(val payload: List<Pokemon>) : PokemonScreenState()
}

sealed class PokemonDetailsScreenState : ScreenState() {
    data class Content(val payload: Pokemon) : PokemonDetailsScreenState()
}
