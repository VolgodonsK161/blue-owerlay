package com.example.bluescreen // Внимание: проверьте, чтобы совпадало с вашим пакетом!

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        try {
            // Ваш код
            val textView = TextView(this)
            textView.text = "Ура! Приложение работает!"
            textView.gravity = Gravity.CENTER
            textView.textSize = 24f

            setContentView(textView)
            // Конец вашего кода
            
        } catch (e: Exception) {
            // Если произойдет ошибка, покажем её на экране
            android.app.AlertDialog.Builder(this)
                .setTitle("ПРИЛОЖЕНИЕ ВЫЛЕТЕЛО!")
                .setMessage(e.stackTraceToString())
                .setPositiveButton("OK", null)
                .show()
        }
    }
}