package com.poke.pokeapp.domain.model

data class GetCharactersResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonModel>
)
