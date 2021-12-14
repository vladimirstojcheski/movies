package com.example.movies.model

data class Movie(
    val id: Int,
    val name: String,
    val description: String,
    val director: String,
    val actors: MutableList<String>
)
