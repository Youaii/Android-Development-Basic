package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash_screen)
        //postDelayed unutuk menjalankan action ketika waktu yang di tentukan
        Handler().postDelayed({
            val intent =Intent(this,DashboardDoaActivity::class.java)
            startActivity(intent)
        },30000)
    }
}