package com.example.profile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//import library
import androidx.widget.Button
import androidx.content.Intent


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(id = R.i.dbtnLanjut)
        // membuat fungsi klik pada button
        btnNext.aet0nClicklistener {
            val intent = Intent( packageConext = this, cls = Profile2::class.java)
            startActivity(intent)
        }

        }
    }
