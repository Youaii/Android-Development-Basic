package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val countNumber : TextView = findViewById(R.id.tvNumber)
        val btnCount : Button = findViewById(R.id.buttonCount)
        val btnMin : Button = findViewById(R.id.buttonMin)
        val btnReset : Button =  findViewById(R.id.buttonReset)

        countNumber.text = "100"
        println(countNumber.text)
        Log.d("Number", "hasil nya : ${countNumber.text}")

        btnCount.setOnClickListener {
            var tvNumber : Int = countNumber.text.toString().toInt()
            tvNumber++

            countNumber.text = tvNumber.toString()
        }
        btnMin.setOnClickListener {
            var tvNumber : Int = countNumber.text.toString().toInt()
            tvNumber--

            countNumber.text = tvNumber.toString()
        }
        btnReset.setOnClickListener {


            countNumber.text = "0"
        }
    }
}