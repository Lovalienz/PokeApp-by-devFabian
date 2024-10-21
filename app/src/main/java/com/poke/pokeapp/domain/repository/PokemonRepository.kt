package com.poke.pokeapp.domain.repository

interface PokemonRepository {
    suspend fun getALlCharacters()
}