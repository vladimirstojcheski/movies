package com.example.movies

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView


class MovieDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_movie_details, container, false)
        val activity = activity as MainActivity

        val movieTitle = view.findViewById<TextView>(R.id.movieTitleViewId)
        val movieId = view.findViewById<TextView>(R.id.movieViewId)
        val movieDescription = view.findViewById<TextView>(R.id.movieDescriptionViewId)
        val movieProducer = view.findViewById<TextView>(R.id.movieDirectorViewId)
        val actorList = view.findViewById<ListView>(R.id.actorstListViewId)

        val movie = activity.getMovie()
        val actors = movie.actors

        val adapter = ArrayAdapter(view.context,android.R.layout.simple_list_item_1, actors)
        actorList.adapter = adapter

        movieTitle.text = movie.name
        movieId.text = movie.id.toString()
        movieDescription.text = movie.description
        movieProducer.text = movie.director


        return view
    }

}