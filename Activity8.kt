package com.example.dermacare_ma_prototype

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity8 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_8)

        val home6button = findViewById<Button>(R.id.home6_btn)
        home6button.setOnClickListener {
            val intent = Intent(this,Activity3::class.java)
            startActivity(intent)
        }
    }
}