package com.poke.pokeapp.di

import com.poke.pokeapp.data.dataSource.remote.PokemonRemoteDataSource
import com.poke.pokeapp.data.dataSource.remote.PokemonRemoteDataSourceImp
import com.poke.pokeapp.data.dataSource.remote.service.PokemonApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {

    @Provides
    fun provideRemoteDataSource(pokemonService: PokemonApiService): PokemonRemoteDataSource =
        PokemonRemoteDataSourceImp(pokemonService)
}