package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.common

import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun ProcessLoading() {
    CircularProgressIndicator(
        modifier = Modifier.semantics {
            this.contentDescription = "Circular loading icon"
        })
}
