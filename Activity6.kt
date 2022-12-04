package com.example.dermacare_ma_prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_6)

        val home4button = findViewById<Button>(R.id.home4_btn)
        home4button.setOnClickListener {
            val intent = Intent(this, Activity3::class.java)
            startActivity(intent)
        }
    }
}