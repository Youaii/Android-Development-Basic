package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanList_Activity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val arrayAdapter : ArrayAdapter<*>
        val bahasa = arrayOf(
            "1.Python","2.C#","3. C++","4. javaScript","5. PHP","6. Swift","7. Java","8. Go","9. SQL","10. Ruby"
        )
        var kListView:ListView = findViewById(R.id.rvbahasa)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            bahasa)

        kListView.adapter = arrayAdapter
    }
}