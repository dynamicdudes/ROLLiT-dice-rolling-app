package com.dynamicdudes.rollit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var randomNumber1 : Int? = null
    private var randomNumber2 : Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar?.title = "The dice of Zeus always fall luckily."
        roll_button_clicked.setOnClickListener {
            rollDice()
        }
    }
    fun rollDice(){
        randomNumber1 = selectImage(Random.nextInt(6) + 1)
        randomNumber2 = selectImage(Random.nextInt(6) + 1)
        dice_image_1.setImageResource(randomNumber1!!)
        dice_image_2.setImageResource(randomNumber2!!)
    }
    fun selectImage(ranNum:Int) : Int{
        return when(ranNum){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
    }
}
