package com.gorrotowi.notesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val txtTitle by lazy {
        findViewById<TextView>(R.id.txtNoteTitle)
    }
    val txtContent by lazy {
        findViewById<TextView>(R.id.txtNoteContent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val imgAddNote = findViewById<ImageView>(R.id.imgAddNewNote)
        txtTitle.text = "No Note"
        txtContent.text = "No Content"

        imgAddNote.setOnClickListener {
            val intent = Intent(this, NewNoteActivity::class.java)
            startActivity(intent)
        }


    }

    override fun onResume() {
        super.onResume()
        Log.d("Title", "El title es ${NotesData.title}")
        Log.d("Content", "El content es ${NotesData.content}")

        txtTitle.text = NotesData.title
        txtContent.text = NotesData.content
    }

}