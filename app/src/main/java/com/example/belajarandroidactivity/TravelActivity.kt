package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibCall : ImageButton? = null
    var ibNavigator : ImageButton? = null
    var ibShare : ImageButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        ibCall = findViewById(R.id.ibcall)
        ibNavigator = findViewById(R.id.ibnavigation)
        ibShare = findViewById(R.id.ibshare)

       ibCall!!.setOnClickListener{
           //parameter intent untuk telpon Intent.Action_DIAL
           val phoneNumber = "0895629630009"
           val phoneIntent = Intent(Intent.ACTION_DIAL,
           Uri.parse("tel:$phoneNumber"))

           startActivity(phoneIntent)
       }
        ibNavigator!!.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:-6.548471554777968, 106.725774022798"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }

        ibShare!!.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.setType("text/plain")

            startActivity(Intent.createChooser(shareIntent, "Share to :"))
        }
    }
}