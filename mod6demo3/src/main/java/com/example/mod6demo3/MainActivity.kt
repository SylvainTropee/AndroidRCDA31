package com.example.mod6demo3

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val activityContract = registerForActivityResult(ActivityResultContracts.RequestPermission()){isGranted ->
        if(isGranted){
            Intent(Intent.ACTION_CALL, Uri.parse("tel:0606060606")).also {
                startActivity(it)
            }
        }else{
            Intent(Intent.ACTION_DIAL, Uri.parse("tel:0606060606")).also {
                startActivity(it)
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            activityContract.launch(Manifest.permission.CALL_PHONE)
        }

    }
}