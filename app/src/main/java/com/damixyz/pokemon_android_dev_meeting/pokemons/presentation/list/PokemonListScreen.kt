package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.list

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.PokemonDetailsScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.PokemonScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.ScreenState
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.model.Pokemon
import com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.common.ProcessError
import com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.common.ProcessLoading

@Composable
fun PokemonListScreen(screenState: ScreenState, onLaunchDetailsScreen: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        when (screenState) {
            ScreenState.Empty -> TODO()
            is ScreenState.Error -> ProcessError(errorMessage = screenState.errorMessages)
            is ScreenState.Loading -> ProcessLoading()
            is PokemonScreenState.Content -> processContain(
                payload = screenState.payload,
                onLaunchDetailsScreen
            )
            is PokemonDetailsScreenState.Content -> TODO()
        }
    }
}


@Composable
private fun processContain(payload: List<Pokemon>, onLaunchDetailsScreen: () -> Unit) {
    Column {
        Text(text = "Hello world from List Screen")
        Button(onClick = onLaunchDetailsScreen) {
            Text(text = "Details Screen")
        }
    }
}

