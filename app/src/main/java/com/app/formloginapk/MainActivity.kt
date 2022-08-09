package com.app.formloginapk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tombol = findViewById<Button>(R.id.tombol)
        tombol.setOnClickListener {
            val pindahIntent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(pindahIntent)
        }
    }
}