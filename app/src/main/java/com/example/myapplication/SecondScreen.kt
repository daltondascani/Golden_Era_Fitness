package com.example.myapplication

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id.button_click2
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapter.ItemAdapter
import com.example.myapplication.data.Datasource


class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_screen)

        // Enables page to load workouts from the data
        val myDataset = Datasource().loadLegWorkouts()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

        // Links the main menu button click with the SecondScreen activity
        //so the user can navigate back and forth between screens
        val buttonClick = findViewById<Button>(button_click2)
        buttonClick.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}