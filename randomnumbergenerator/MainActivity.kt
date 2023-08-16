package com.example.randomnumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generatorButton = findViewById<Button>(R.id.generatorButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)

        // the pool of numbers to choose from should have at least two numbers, so I need to add 2 to the seekBar.progress
        // the value should always be between 1 and the maximum selected with the seekBar, so I need to add 1 after randomising
        generatorButton.setOnClickListener {
            val rand = java.util.Random().nextInt(seekBar.progress+2)+1
            resultTextView.text = rand.toString()
        }
    }
}
