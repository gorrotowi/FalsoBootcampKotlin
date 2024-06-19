package com.gorrotowi.notesapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class NewNoteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_note)

        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            finish()
        }
    }
}