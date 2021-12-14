package com.example.movies.adapters

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.movies.R

import com.example.movies.model.Movie


interface OnItemClickListener{
    fun onItemClickListener(movie: Movie)
}


class MyItemRecyclerViewAdapter(val movies: List<Movie>, private val itemClickListener: OnItemClickListener
) : RecyclerView.Adapter<MyItemRecyclerViewAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val movieId: TextView
        val movieName: TextView
        val movieProducer: TextView

        init {
            movieId = view.findViewById(R.id.movieId)
            movieName = view.findViewById(R.id.movieName)
            movieProducer = view.findViewById(R.id.movieProducer)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_movie_list_row, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentMovie: Movie = movies[position]

        holder.movieId.text = currentMovie.id.toString()
        holder.movieName.text = currentMovie.name
        holder.movieProducer.text = currentMovie.director

        holder.itemView.setOnClickListener{
            itemClickListener.onItemClickListener(currentMovie)
        }
    }

    override fun getItemCount(): Int {
        return movies.size


    }

}