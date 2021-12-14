package com.example.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movies.model.Movie

class MainActivity : AppCompatActivity() {

    private var movies = initList()
    private var movie: Movie = movies[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun initList(): MutableList<Movie>
    {
        return mutableListOf(
            Movie(1, "Movie1", "Movie description 1", "Movie Director1", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(2, "Movie2", "Movie description 2", "Movie Director2", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(3, "Movie3", "Movie description 3", "Movie Director3", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(4, "Movie4", "Movie description 4", "Movie Director4", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(5, "Movie5", "Movie description 5", "Movie Director5", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(6, "Movie6", "Movie description 6", "Movie Director6", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(7, "Movie7", "Movie description 7", "Movie Director7", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(8, "Movie8", "Movie description 8", "Movie Director8", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(9, "Movie9", "Movie description 9", "Movie Director9", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(10, "Movie10", "Movie description 10", "Movie Director10", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(11, "Movie11", "Movie description 11", "Movie Director11", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(12, "Movie12", "Movie description 12", "Movie Director12", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
            Movie(13, "Movie13", "Movie description 13", "Movie Director13", mutableListOf("actor1", "actor2","actor3", "actor4",
                "actor5", "actor6","actor7", "actor8","actor9", "actor10","actor11", "actor12")),
        )
    }

    fun getMovies(): MutableList<Movie> {
        return movies
    }

    fun setMovie(movie: Movie)
    {
        this.movie = movie
    }

    fun getMovie(): Movie
    {
        return this.movie
    }

    fun addMovie(movie: Movie)
    {
        this.movies.add(movie)
    }

}