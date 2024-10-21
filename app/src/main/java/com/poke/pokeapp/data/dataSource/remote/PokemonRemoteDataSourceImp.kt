package com.poke.pokeapp.data.dataSource.remote

import com.poke.pokeapp.data.dataSource.remote.service.PokemonApiService


class PokemonRemoteDataSourceImp(private val pokemonApi: PokemonApiService): PokemonRemoteDataSource {

    override suspend fun getAllCharacters(pageNumber: Int) = pokemonApi.getAllCharacters(pageNumber)

    override suspend fun getCharacterInfo(idPokemon: Int) = pokemonApi.getCharacterInfo(idPokemon)

}