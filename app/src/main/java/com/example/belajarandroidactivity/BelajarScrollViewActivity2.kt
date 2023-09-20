package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity2 : AppCompatActivity() {
    var ivBackground: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view2)
        ivBackground = findViewById(R.id.ivbackground)
        Glide.with(this)
            .load(R.drawable.boku)
            .transform(BlurTransformation(7,3))
            .into(ivBackground!!)
    }
}