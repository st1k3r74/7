package com.example.prakt7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        val textView2 = findViewById<TextView>(R.id.textView2)
        val textView3 = findViewById<TextView>(R.id.textView3)
        btn.setOnClickListener {
            val random = Random.nextInt(-100, 100) + 1
            textView.text = random.toString()

            val num = random;
            if (num % 2 == 0)
            //println("$num chet")
                textView2.text = "Четное"
            else
            //println("$num nechet")
                textView2.text = "Не четное"

            if (num < 0) {
                //отриц
                textView3.text = "Число отрицательное"
            }
            if (num == 0) {
                //null
                textView3.text = "Число равно 0"
            }

            if (num > 0) {
                //non отриц
                textView3.text = "Число положительное"


            }

            fun random(view: View) {

            }
        }
    }
}