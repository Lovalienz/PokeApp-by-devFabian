package com.poke.pokeapp.domain.repository

import com.poke.pokeapp.domain.model.PokemonInfoModel
import kotlinx.coroutines.flow.Flow

interface PokemonRepository {
    suspend fun getALlCharacters()
}