package com.poke.pokeapp.di

import com.poke.pokeapp.domain.repository.PokemonRepository
import com.poke.pokeapp.domain.useCase.GetAllCharactersUseCase
import com.poke.pokeapp.domain.useCase.PokemonUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun providePokemonUseCase(pokemonRepository: PokemonRepository) = PokemonUseCase(
        getAllCharacters = GetAllCharactersUseCase(pokemonRepository)
    )
}