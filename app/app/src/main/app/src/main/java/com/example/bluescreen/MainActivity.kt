package com.example.bluescreen // Внимание: проверьте, чтобы совпадало с вашим пакетом!

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val textView = TextView(this)
        textView.text = "Ура! Приложение работает!"
        textView.gravity = Gravity.CENTER
        textView.textSize = 24f
        
        setContentView(textView)
    }
}