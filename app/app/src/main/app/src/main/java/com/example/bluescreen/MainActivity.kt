package com.example.bluescreen

import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this)
        textView.text = "Ура! Приложение работает!"
        textView.gravity = Gravity.CENTER
        textView.textSize = 24f
        
        setContentView(textView)
    }
} 