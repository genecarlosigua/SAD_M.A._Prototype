package com.example.dermacare_ma_prototype

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val home2button = findViewById<Button>(R.id.home2_btn)
        home2button.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }
}