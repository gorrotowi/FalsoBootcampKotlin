package com.gorrotowi.notesapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_note)

        val botonsafe = findViewById<Button>(R.id.btnsafe)
        val edtxTitle = findViewById<EditText>(R.id.edtxTitle)
        val edtxContent = findViewById<EditText>(R.id.edtxContent)

        botonsafe.setOnClickListener{
            val title = edtxTitle.text.toString()
            val content = edtxContent.text.toString()
            NotesData.title = title
            NotesData.content = content
            finish()
        }

    }
}