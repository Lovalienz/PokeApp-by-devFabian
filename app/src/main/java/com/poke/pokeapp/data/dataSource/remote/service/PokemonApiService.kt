package com.poke.pokeapp.data.dataSource.remote.service

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokemonApiService {
    @GET("pokemon?limit=25")
    suspend fun getAllCharacters(@Query("offset") pageNumber: Int)

    @GET("pokemon/{id}")
    suspend fun getCharacterInfo(@Path("id") characterId: Int)
}