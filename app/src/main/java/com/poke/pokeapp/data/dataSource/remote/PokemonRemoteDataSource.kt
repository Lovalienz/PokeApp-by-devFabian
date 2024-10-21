package com.poke.pokeapp.data.dataSource.remote

import com.poke.pokeapp.domain.model.GetCharactersResponse
import com.poke.pokeapp.domain.model.PokemonInfoModel
import retrofit2.Response

interface PokemonRemoteDataSource {
    suspend fun getAllCharacters(pageNumber: Int): Response<GetCharactersResponse>
    suspend fun getCharacterInfo(idPokemon: Int): Response<PokemonInfoModel>
}