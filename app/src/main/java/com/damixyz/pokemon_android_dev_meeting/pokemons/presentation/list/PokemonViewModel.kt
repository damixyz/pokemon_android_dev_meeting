package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.list

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.ScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase.GetPokemonsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonsUseCase: GetPokemonsUseCase
) : ViewModel() {
    private val _state = mutableStateOf<ScreenState>(
        ScreenState.Loading(isLoading = true)
    )
    val state: State<ScreenState>
        get() = _state

    init {
        getPokemonList()
    }

    private fun getPokemonList() {
        viewModelScope.launch {
            val list = getPokemonsUseCase.execute()
            _state.value = list
        }
    }

}