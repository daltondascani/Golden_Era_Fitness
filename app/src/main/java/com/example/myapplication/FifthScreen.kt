package com.example.myapplication

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id.button_click5
import com.github.barteksc.pdfviewer.PDFView

class FifthScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fifth_screen)

        // Allows the pdfview to be accessed in the screen by declaring its location id
        // and loading the imported document to the screen
        val pdfView : PDFView = findViewById(R.id.pdfView)
        val assetManager = this.assets
        val inputStream = assetManager.open("DUP Training Ebook.pdf")
        pdfView.fromStream(inputStream).load()

        // Links the main menu button click with the Fifth1Screen activity
        //so the user can navigate back and forth between screens
        val buttonClick = findViewById<Button>(button_click5)
        buttonClick.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }


}