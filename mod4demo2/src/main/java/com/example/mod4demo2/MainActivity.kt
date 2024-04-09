package com.example.mod4demo2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(this, "Article sauvegardé", Toast.LENGTH_LONG).show()
            //Snackbar.make(it, "Article sauvegardé", Snackbar.LENGTH_LONG).show()
            findViewById<TextView>(R.id.tv_save).text = "Sauvegardé !"
        }



    }
}