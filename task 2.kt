package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.editTextTextPersonName)
        val checkBox:CheckBox = findViewById(R.id.checkBox)
        val textViev:TextView = findViewById(R.id.textView)
        val bar:ProgressBar = findViewById(R.id.progressBar)

        button.setOnClickListener {
            if (checkBox.isChecked) {
                textViev.text = editText.text
                bar.progress += 10

            }

        }
    }
}
