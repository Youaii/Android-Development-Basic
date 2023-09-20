package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

         var inputAngka1 : EditText = findViewById(R.id.inputAngka1)
         var inputAngka2 : EditText = findViewById(R.id.inputAngka2)
         val tombolCount : Button =  findViewById(R.id.count)
         val tombolMinus : Button =  findViewById(R.id.minus)
         val tombolPersen : Button =  findViewById(R.id.persentase)
         val tombolKali : Button =  findViewById(R.id.multiplied)
         val tombolBagi : Button =  findViewById(R.id.devide)
         val tombolClear : Button =  findViewById(R.id.clear)
        var hasil3 : TextView = findViewById(R.id.hasil3)
        val builder:AlertDialog.Builder = AlertDialog.Builder(this@KalkulatorActivity)

        tombolCount.setOnClickListener{
            var num1 : Int =inputAngka1.text.toString() . toInt()
            var num2 : Int =  inputAngka2.text.toString() . toInt()
            var hasil: Int
            var hasil2 : String
            hasil = num1 + num2
            hasil3.text = hasil.toString()

        }
        tombolMinus.setOnClickListener{
            var num1 : Int =inputAngka1.text.toString() . toInt()
            var num2 : Int =  inputAngka2.text.toString() . toInt()
            var hasil: Int
            var hasil2 : String
            hasil = num1 - num2
            hasil3.text = hasil.toString()

        }
        tombolPersen.setOnClickListener{
            var num1 : Int =inputAngka1.text.toString() . toInt()
            var num2 : Int =  inputAngka2.text.toString() . toInt()
            var hasil: Int
            var hasil2 : String
            hasil = num1 % num2
            hasil3.text = hasil.toString()

        }
        tombolKali.setOnClickListener{
            var num1 : Int =inputAngka1.text.toString() . toInt()
            var num2 : Int =  inputAngka2.text.toString() . toInt()
            var hasil: Int
            var hasil2 : String
            hasil = num1 * num2
            hasil3.text = hasil.toString()

        }
        tombolBagi.setOnClickListener{
            var num1 : Int =inputAngka1.text.toString() . toInt()
            var num2 : Int =  inputAngka2.text.toString() . toInt()
            var hasil: Int
            var hasil2 : String
            hasil = num1 / num2
            hasil3.text = hasil.toString()

        }
        tombolClear.setOnClickListener{
            builder.setTitle("Perhatian")
            builder.setMessage("Kamu yakin untuk mengClear")
            builder.setCancelable(false)
            builder.setIcon(R.drawable.baseline_info_24)
            builder.setPositiveButton("YES", DialogInterface.OnClickListener({dialog, which ->
                hasil3.text = "0"
                inputAngka1.setText("0")
                inputAngka2.setText("0")
            }))
            builder.setNegativeButton( "NO", DialogInterface.OnClickListener({dialog, which ->  }))
            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}