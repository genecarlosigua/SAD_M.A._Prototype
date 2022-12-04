package com.example.dermacare_ma_prototype

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val logoutbutton = findViewById<Button>(R.id.logout_btn)
        logoutbutton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val servicebutton = findViewById<Button>(R.id.service_btn)
        servicebutton.setOnClickListener {
            val intent = Intent(this,Activity4::class.java)
            startActivity(intent)
        }

        val schedulebutton = findViewById<Button>(R.id.schedule_btn)
        schedulebutton.setOnClickListener {
            val intent = Intent(this,Activity5::class.java)
            startActivity(intent)
        }

        val productsbutton = findViewById<Button>(R.id.products_btn)
       productsbutton.setOnClickListener {
            val intent = Intent(this,Activity6::class.java)
            startActivity(intent)
        }

        val guidebutton = findViewById<Button>(R.id.guide_btn)
        guidebutton.setOnClickListener {
            val intent = Intent(this,Activity7::class.java)
            startActivity(intent)
        }

        val checkbutton = findViewById<Button>(R.id.check_btn)
        checkbutton.setOnClickListener {
            val intent = Intent(this,Activity8::class.java)
            startActivity(intent)
        }
    }
}
