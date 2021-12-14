package com.example.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.adapters.MyItemRecyclerViewAdapter
import com.example.movies.adapters.OnItemClickListener
import com.example.movies.model.Movie


class MovieListFragment : Fragment(), OnItemClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val activity = activity as MainActivity

        val data = activity.getMovies()
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)
        val adapter = MyItemRecyclerViewAdapter(data, this)

        val recyclerView: RecyclerView = view.findViewById(R.id.recView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(view.context)
        recyclerView.adapter = adapter

        val addMovieButton = view.findViewById<Button>(R.id.addMovieButton)

        addMovieButton.setOnClickListener(){
            findNavController().navigate(R.id.action_movieListFragment_to_addNewMovieFragment, null)
        }

        return view


    }

    override fun onItemClickListener(movie: Movie) {
        val activity = activity as MainActivity
        activity.setMovie(movie)
        findNavController().navigate(R.id.action_movieListFragment_to_movieDetailsFragment, null)
    }

}