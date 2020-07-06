package com.trinitydigital.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    var tvTitle: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTitle = findViewById(R.id.tvTitle)
        val btnClick = findViewById<Button>(R.id.btnClick)
        val close = findViewById<ConstraintLayout>(R.id.close)

        btnClick.setOnClickListener {
            close.visibility = View.GONE
            val intent = Intent(this, MainActivity2::class.java)
            val txt = tvTitle?.text.toString()
            intent.putExtra("text", txt)

            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.settings -> tvTitle?.text = getString(R.string.settings)
            R.id.aboutMe -> tvTitle?.text = getString(R.string.about_me)
            R.id.exit -> finish()
            R.id.profile -> tvTitle?.text = getString(R.string.my_profile)
        }

        return super.onOptionsItemSelected(item)
    }
}