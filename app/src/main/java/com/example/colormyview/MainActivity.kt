package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var boxOneText: TextView
    private lateinit var boxTwoText: TextView
    private lateinit var boxThreeText: TextView
    private lateinit var boxFourText: TextView
    private lateinit var boxFiveText: TextView
    private lateinit var constraintLayout: ConstraintLayout
    private lateinit var redButton: Button
    private lateinit var yellowButton: Button
    private lateinit var greenButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boxOneText = findViewById(R.id.boxOneText)
        boxTwoText = findViewById(R.id.boxTwoText)
        boxThreeText = findViewById(R.id.boxThreeText)
        boxFourText = findViewById(R.id.boxFourText)
        boxFiveText = findViewById(R.id.boxFiveText)
        redButton = findViewById(R.id.redButton)
        yellowButton = findViewById(R.id.yellowButton)
        greenButton = findViewById(R.id.greenButton)
        constraintLayout = findViewById(R.id.constraintLayout)

        setListeners()
    }

    private fun setListeners() {
        val clicableViews: List<View> =
            listOf(
                boxOneText,
                boxTwoText,
                boxThreeText,
                boxFourText,
                boxFiveText,
                constraintLayout,
                redButton,
                yellowButton,
                greenButton
            )

        for (item in clicableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoText -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)


            R.id.redButton -> boxOneText.setBackgroundResource(R.color.myRed)
            R.id.yellowButton -> boxTwoText.setBackgroundResource(R.color.myYellow)
            R.id.greenButton -> boxThreeText.setBackgroundResource(R.color.myGreen)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

}


