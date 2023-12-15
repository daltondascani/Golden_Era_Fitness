package com.example.myapplication

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R.id.button_click4
import com.example.myapplication.adapter.ItemAdapter
import com.example.myapplication.data.Datasource

class FourthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fourth_screen)

        //Enables the page to load workouts from data source
        val myDataset = Datasource().loadPullWorkouts()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)
        recyclerView.setHasFixedSize(true)

        // Links the main menu button click with the FourthScreen activity
        //so the user can navigate back and forth between screens
        val buttonClick = findViewById<Button>(button_click4)
        buttonClick.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}