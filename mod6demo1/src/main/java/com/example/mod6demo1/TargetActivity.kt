package com.example.mod6demo1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        //récupère la donnée
        val temperature = intent.getIntExtra("temperature", 0)
        //affiche la donnée
        findViewById<TextView>(R.id.textView).text = "$temperature °C"
    }
}