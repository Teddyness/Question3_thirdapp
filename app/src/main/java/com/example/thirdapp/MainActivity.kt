package com.example.thirdapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val launchHabitTrackerButton = findViewById<Button>(R.id.launchHabitTrackerButton)
        val launchCalculatorButton = findViewById<Button>(R.id.launchCalculatorButton)

        launchHabitTrackerButton.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_MAIN
            intent.setClassName("com.example.habittracker", "com.example.habittracker.MainActivity")
            intent.putExtra("extra_data", "Start Habit Tracker")
            startActivity(intent)
        }

        launchCalculatorButton.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_MAIN
            intent.setClassName("com.example.question_1_calculator", "com.example.question_1_calculator.MainActivity")
            intent.putExtra("extra_data", "Start Calculator")
            startActivity(intent)
        }
    }
}
