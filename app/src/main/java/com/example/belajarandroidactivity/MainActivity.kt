package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judulForm: TextView = findViewById(R.id.judulFormulir)
        val labelNama: TextView = findViewById(R.id.labelNama)
        val labelKelas: TextView = findViewById(R.id.labelKelas)
        val labelKodeBuku: TextView = findViewById(R.id.labelKode)

        val inputNama: EditText = findViewById(R.id.inputNama)
        val inputKelas: EditText = findViewById(R.id.inputKelas)
        val inputKodeBuku: EditText = findViewById(R.id.inputKode)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val tampilNama: TextView = findViewById(R.id.tampilNama)
        val tampilKelas: TextView = findViewById(R.id.tampilKelas)
        val tampilBuku: TextView = findViewById(R.id.tampilBuku)

        btnSubmit.setOnClickListener {
//            Toast.makeText(
//                this, "Hello ${tampilBuku.text}",
//                Toast.LENGTH_SHORT
//            ).show()

            val hasil: Int = inputKodeBuku.text.toString().toInt()

            tampilNama.text = inputNama.text
            tampilKelas.text = inputKelas.text

            when (hasil) {
                123 -> tampilBuku.text ="Harry Potter"
                456 -> tampilBuku.text ="Alice In Wonderland"
                789 -> tampilBuku.text ="Vinland Saga"
                else -> "Buku tidak di temukan"
            }
            tampilBuku.text
            Toast.makeText(this,"Buku Pinjaman ${tampilBuku.text}", Toast.LENGTH_SHORT).show()
        }
    }
}
