package br.com.up.pokedex.model

data class Pokemon(
    val id: Int,
    val url: String,
    val name: String,
    val types: List<Type>,
    val stats: List<Stat>,
    val abilities: List<Ability>,
    val moves: List<Move>
)
