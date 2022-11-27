package br.com.up.pokedex.model

data class Ability(
    val is_hidden: Boolean,
    val slot: Int,
    val ability: PokemonAbility
)