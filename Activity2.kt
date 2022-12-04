package com.example.dermacare_ma_prototype

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val loginbutton = findViewById<Button>(R.id.login_btn)
        loginbutton.setOnClickListener{
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}