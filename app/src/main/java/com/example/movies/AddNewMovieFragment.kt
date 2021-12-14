package com.example.movies

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.movies.model.Movie


class AddNewMovieFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_new_movie, container, false)

        val activity = activity as MainActivity

        val addMovieTitleText = view.findViewById<EditText>(R.id.addMovieTitleId)
        val addDescriptionText = view.findViewById<EditText>(R.id.addDescriptionId)
        val addDirectorText = view.findViewById<EditText>(R.id.addDirectorId)

        val confirmAddMovieButton = view.findViewById<Button>(R.id.confirmAddMovieButton)
        val cancelAddMovieButton = view.findViewById<Button>(R.id.cancelAddMovieButton)
        val addActorButton = view.findViewById<Button>(R.id.addActorButtonId)

        var actorList = mutableListOf<String>()

        addActorButton.setOnClickListener{view ->
            var builder = AlertDialog.Builder(view.context)
            val actor = EditText(view.context)
            actor.setHint("input actor name")

            builder
                .setTitle("Actor input section")
                .setView(actor)
                .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                    actorList.add(actor.text.toString())
                    Toast.makeText(activity, "Actor successfully added", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, id ->
                })

            builder.create()

            builder.show()}

        confirmAddMovieButton.setOnClickListener(){
            val allMovies = activity.getMovies()
            val movie = Movie(allMovies.size + 1, addMovieTitleText.text.toString(),
                addDescriptionText.text.toString(),
                addDirectorText.text.toString(), actorList)
            activity.addMovie(movie)
            findNavController().navigate(R.id.action_addNewMovieFragment_to_movieListFragment, null)
        }

        cancelAddMovieButton.setOnClickListener(){
            findNavController().navigate(R.id.action_addNewMovieFragment_to_movieListFragment, null)
        }

        return view
    }

}