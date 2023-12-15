package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.id.button_click


class FirstScreen : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_screen)

        // Links the main menu button click with the FirstScreen activity
        //so the user can navigate back and forth between screens
        val buttonClick = findViewById<Button>(button_click)
        buttonClick.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Declares values for the fields used to calculate BMI
        val height = findViewById<EditText>(R.id.heightEditText)
        val weight = findViewById<EditText>(R.id.weightEditText)

        val calcButton = findViewById<Button>(R.id.button)
        val clearButton = findViewById<Button>(R.id.clearButton)
        val bmiInfo = findViewById<TextView>(R.id.infoBMITextView)

        // Make info text invisible until Calculate button is pressed
        bmiInfo.visibility = View.INVISIBLE

        // If statements set up to filter the user input into the BMI formula.
        calcButton.setOnClickListener{
            var heightValue = 0.0
            var weightValue = 0.0
            if(height.text.toString().isNotEmpty()){
                heightValue = height.text.toString().toDouble()
            }
            if(weight.text.toString().isNotEmpty()){
                weightValue = weight.text.toString().toDouble()
            }
            if(weightValue > 0.0 && heightValue > 0.0){
                val bmiValue = String.format("%.2f",
                    weightValue/(heightValue*heightValue)*703)
                bmiValue.toDouble()
                bmiInfo.text = "You are considered: " +
                        bmiResults(weightValue/(heightValue*heightValue)*703)
                bmiInfo.visibility = VISIBLE
            }
            else {
                Toast.makeText(
                    this, "Please input Weight and Height Values greater than 0",
                    Toast.LENGTH_LONG).show()
            }
        }

        clearButton.setOnClickListener {
            weight.text.clear()
            height.text.clear()
        }

    }

    // BMI information is taken and the number value is sorted to return where
    // the user lies on the BMI scale.
    private fun bmiResults(bmi:Double):String{
        val answer: String = if(bmi<18.5){
            "Underweight"
        } else if(bmi > 18.5 && bmi < 24.9) {
            "Normal"
        } else if(bmi > 24.9 && bmi < 30) {
            "Overweight"
        } else {
            "Obese"
        }
        return answer
    }

}
