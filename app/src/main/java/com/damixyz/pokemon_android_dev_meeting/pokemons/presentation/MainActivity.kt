package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.details.PokemonDetailsScreen
import com.damixyz.pokemon_android_dev_meeting.pokemons.presentation.list.PokemonListScreen
import com.damixyz.pokemon_android_dev_meeting.ui.theme.Pokemon_android_dev_meetingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Pokemon_android_dev_meetingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PokemonApp()
                }
            }
        }
    }
}

@Composable
private fun PokemonApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = PokemonScreen.route_pokemon_list) {
        PokemonScreen.screens.forEach { screen ->
            composable(screen.route) {
                MapRoutesToScreen(screen = screen, navController = navController)
            }
        }
    }
}

@Composable
private fun MapRoutesToScreen(screen: PokemonScreen, navController: NavController) {
    when (screen) {
        PokemonScreen.PokemonList -> PokemonListScreen {
            navController.navigate(PokemonScreen.route_pokemon_details)
        }
        PokemonScreen.PokemonDetails -> PokemonDetailsScreen()
    }
}