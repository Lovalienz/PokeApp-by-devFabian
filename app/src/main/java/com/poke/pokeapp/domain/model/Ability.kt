package com.poke.pokeapp.domain.model

import com.google.gson.annotations.SerializedName

data class Ability(
    val abilities: AbilityContent
)

data class AbilityContent(
    val name: String,
    @SerializedName("is_hidden") val isHidden: Boolean
)
