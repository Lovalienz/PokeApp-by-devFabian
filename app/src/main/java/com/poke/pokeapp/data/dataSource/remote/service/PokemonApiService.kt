package com.poke.pokeapp.data.dataSource.remote.service

import com.poke.pokeapp.domain.model.GetCharactersResponse
import com.poke.pokeapp.domain.model.PokemonInfoModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApiService {
    @GET("pokemon?limit=25")
    suspend fun getAllCharacters(@Query("offset") pageNumber: Int): Response<GetCharactersResponse>

    @GET("pokemon/{id}")
    suspend fun getCharacterInfo(@Path("id") characterId: Int): Response<PokemonInfoModel>
}