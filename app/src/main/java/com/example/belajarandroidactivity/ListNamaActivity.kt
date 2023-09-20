package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
        val arrayAdapter : ArrayAdapter<*>
        val users = arrayOf(
            "Steve Smith","Ross Taylor","Rohit Sharma"
        )
        var mListView:ListView = findViewById(R.id.lvNama)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)

        mListView.adapter = arrayAdapter
    }
}