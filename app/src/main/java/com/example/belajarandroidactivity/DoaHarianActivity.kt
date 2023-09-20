package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaharian: RecyclerView = findViewById(R.id.rvDoaHarian)
        val back: Button = findViewById(R.id.back)

        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Ketika Mendapat Mimpi Baik","اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Alhamdulillahil ladzii qodzoo haajaati"),
            DoaHarian("Doa Bangun Tidur","اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ","Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Sebelum Tidur","بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ","Bismikallohumma ahya wa amuutu")


            )
        val adapter = DoaHarianAdapter(data)
        rvDoaharian.adapter= adapter
        rvDoaharian.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        back.setOnClickListener {
            val intent = Intent(this,DashboardDoaActivity::class.java)
            startActivity(intent)
        }
    }
}