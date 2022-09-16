package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.common

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun ProcessError(errorMessage: String) {
    Text(text = errorMessage)
}
