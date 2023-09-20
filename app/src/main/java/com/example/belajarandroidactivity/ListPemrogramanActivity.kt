package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman2)
        val rvBahasaPemrograman:RecyclerView=
            findViewById(R.id.rvbahasaPemrograman)

        val data = arrayListOf<Language>(
            Language("Golang",R.drawable.golang),
            Language("Python",R.drawable.python),
            Language("C++",R.drawable.cplus),
            Language("Golang",R.drawable.golang),
            Language("Python",R.drawable.python),
            Language("C++",R.drawable.cplus),
            Language("Golang",R.drawable.golang),
        )
        val adapter = LanguageAdapter(data)
        rvBahasaPemrograman.adapter= adapter
        rvBahasaPemrograman.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

    }
}