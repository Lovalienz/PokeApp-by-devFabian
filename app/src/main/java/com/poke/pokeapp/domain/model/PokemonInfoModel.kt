package com.poke.pokeapp.domain.model

import com.google.gson.annotations.SerializedName

data class PokemonInfoModel(
    val id: Int,
    val name: String,
    val abilities: Ability,
    val weight: String,
    val height: String,
    val sprites: Sprite,
    val types:  Types
)

data class Sprite(
    @SerializedName("front_default") val photo: String
)

data class Types(
    val type: PokemonModel
)


