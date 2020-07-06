package com.trinitydigital.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    var tvTitle: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvTitle = findViewById(R.id.tvTitleTwo)

        val textFromIntent = intent.getStringExtra("text")
        tvTitle?.text = textFromIntent
    }
}