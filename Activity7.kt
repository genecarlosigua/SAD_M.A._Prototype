package com.example.dermacare_ma_prototype

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity7 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_7)

        val home5button = findViewById<Button>(R.id.home5_btn)
        home5button.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }
}