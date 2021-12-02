package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val red = findViewById<TextView>(R.id.red)
        val green =findViewById<TextView>(R.id.green)
        val blue =findViewById<TextView>(R.id.blue)
        val display =findViewById<TextView>(R.id.display)

        red.setOnClickListener()

        {
            display.text = "Red was clicked"
        }
        green.setOnClickListener()
        {
            display.text = "Green was clicked"
        }
        blue.setOnClickListener()
        {
            display.text = "Blue was clicked"
        }


    }
}