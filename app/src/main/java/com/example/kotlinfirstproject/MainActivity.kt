package com.example.kotlinfirstproject

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinfirstproject.domain.Movie
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val movie = Movie("The Godfather", 1972)

        var movieCopy = movie.copy(Name = "Mummy")

        button.setOnClickListener {
            //Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show()
            //Toast.makeText(this, "$movie", Toast.LENGTH_SHORT).show()
            //Toast.makeText(this, movie.Name, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, movieCopy.Name, Toast.LENGTH_SHORT).show()

            arrayExamples()
        }
    }

    private fun arrayExamples() {
        var movieList = ArrayList<Movie>()

        for (i in 1..10) {
            Log.v("JM", "test $i")
            movieList.add(Movie("Name$i", i * 100))
        }

        for (movie in movieList) {
            Log.v("JM", movie.Name)
            if (movie.Name == "Name3") {
                Log.v("JM", "If Name")
            }
        }

    }
}
