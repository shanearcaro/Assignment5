package com.shane.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG: String = "MainActivity/"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.newFoodButton)

        button.setOnClickListener {
            startActivity(Intent(this, FoodActivity::class.java))
            Log.d(TAG, "Button has been clicked")
        }
    }
}