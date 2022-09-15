package com.damixyz.pokemon_android_dev_meeting.pokemons.presentation

sealed class PokemonScreen(
    val route: String
) {
    companion object {
        val screens = listOf(
            PokemonList,
            PokemonDetails
        )
        const val route_pokemon_details = "pokemon_details"
        const val route_pokemon_list = "pokemon_list"
    }

    object PokemonDetails : PokemonScreen(route = route_pokemon_details)
    object PokemonList : PokemonScreen(route = route_pokemon_list)
}