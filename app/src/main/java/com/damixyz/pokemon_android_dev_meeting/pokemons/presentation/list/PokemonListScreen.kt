package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.list

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun PokemonListScreen(onLaunchDetailsScreen: () -> Unit) {
    Column {
        Text(text = "Hello world from List Screen")
        Button(onClick = onLaunchDetailsScreen) {
            Text(text = "Details Screen")
        }
    }
}