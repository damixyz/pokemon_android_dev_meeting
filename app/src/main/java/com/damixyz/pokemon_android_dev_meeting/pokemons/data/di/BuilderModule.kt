package com.damixyz.pokemon_android_dev_meeting.pokemons.data.di

import com.damixyz.pokemon_android_dev_meeting.pokemons.data.PokemonRepository
import com.damixyz.pokemon_android_dev_meeting.pokemons.data.PokemonRepositoryImp
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase.GetPokemonDetailUseCase
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase.GetPokemonDetailUseCaseImp
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase.GetPokemonsUseCase
import com.damixyz.pokemon_android_dev_meeting.pokemons.domain.usecase.GetPokemonsUseCaseImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ViewModelComponent

@InstallIn(ActivityComponent::class, ViewModelComponent::class)
@Module
abstract class BuilderModule {

    @Binds
    abstract fun bindGetPokemonUseCase(getPokemonsUseCaseImp: GetPokemonsUseCaseImp):
            GetPokemonsUseCase

    @Binds
    abstract fun bindGetPokemonDetailsUseCase(getPokemonDetailUseCaseImp: GetPokemonDetailUseCaseImp):
            GetPokemonDetailUseCase

    // Repositories
    @Binds
    abstract fun bindPokemonRepository(pokemonRepositoryImp: PokemonRepositoryImp):
            PokemonRepository
}