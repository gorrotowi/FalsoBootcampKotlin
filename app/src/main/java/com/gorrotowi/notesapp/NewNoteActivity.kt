package com.gorrotowi.notesapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class NewNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_note)

        val btnSave = findViewById<Button>(R.id.btnSave)
        val edtxtTitle = findViewById<EditText>(R.id.edtxtTitle)
        val edtxtContent = findViewById<EditText>(R.id.edtxtContent)

        btnSave.setOnClickListener {
            val title = edtxtTitle.text.toString()
            val content = edtxtContent.text.toString()
            NotesData.title = title
            NotesData.content = content
            finish()
        }
    }
}