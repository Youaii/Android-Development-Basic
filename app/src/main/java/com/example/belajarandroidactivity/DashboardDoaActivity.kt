package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.Language

class DashboardDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val rvDoa:RecyclerView = findViewById(R.id.rvDoa)
        val btnijo:Button = findViewById(R.id.butonijo)


        val data = arrayListOf<Doa>(
            Doa("Dzikir & Doa Sunnah Setelah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Duha",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir & Doa Sunnah Setelah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir & Doa Sunnah Setelah Sholat",R.drawable.doa_harian2),

        )
        val adapter = DoaAdapter(data)
        rvDoa.adapter= adapter
        rvDoa.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        btnijo.setOnClickListener {
            val intent =
                Intent (this, DoaHarianActivity::class.java)
            startActivity(intent)
        }


    }
}