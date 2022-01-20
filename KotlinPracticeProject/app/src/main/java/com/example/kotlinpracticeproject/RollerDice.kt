package com.example.kotlinpracticeproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RollerDice : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roller_dice)

        val rollButton: Button = findViewById(R.id.btnRoll)

        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.tvNumber)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
