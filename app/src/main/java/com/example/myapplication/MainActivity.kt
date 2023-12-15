package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id.button_click
import com.example.myapplication.R.id.button_click2
import com.example.myapplication.R.id.button_click3
import com.example.myapplication.R.id.button_click4
import com.example.myapplication.R.id.button_click5

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // First Screen
        val buttonClick = findViewById<Button>(button_click)
        buttonClick.setOnClickListener {
            val intent = Intent(this, FirstScreen::class.java)
            startActivity(intent)
        }
        // Second Screen
        val buttonClick2 = findViewById<Button>(button_click2)
        buttonClick2.setOnClickListener {
            val intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
        }
        // Third Screen
        val buttonClick3 = findViewById<Button>(button_click3)
        buttonClick3.setOnClickListener {
            val intent = Intent(this, ThirdScreen::class.java)
            startActivity(intent)
        }
        // Fourth Screen
        val buttonClick4 = findViewById<Button>(button_click4)
        buttonClick4.setOnClickListener {
            val intent = Intent(this, FourthScreen::class.java)
            startActivity(intent)
        }
        // Fifth Screen
        val buttonClick5 = findViewById<Button>(button_click5)
        buttonClick5.setOnClickListener {
            val intent = Intent(this, FifthScreen::class.java)
            startActivity(intent)
        }
    }
}