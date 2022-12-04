package com.example.dermacare_ma_prototype

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createbutton = findViewById<Button>(R.id.create_btn)
        createbutton.setOnClickListener{
            val intent = Intent (this,Activity2::class.java)
            startActivity(intent)
        }

        val homebutton = findViewById<Button>(R.id.home_btn)
        homebutton.setOnClickListener{
            val intent = Intent (this,Activity3::class.java)
            startActivity(intent)
        }
    }
}