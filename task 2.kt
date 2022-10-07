package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var main_btn: Button? = null
    private var edit_text: EditText? = null
    private var check_box: CheckBox? = null
    private var text_viev: TextView? = null
    private var progres: ProgressBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main_btn = findViewById(R.id.button)
        edit_text = findViewById(R.id.editTextTextPersonName)
        check_box = findViewById(R.id.checkBox)
        text_viev = findViewById(R.id.textView)
        progres = findViewById(R.id.progressBar)

        main_btn?.setOnClickListener {
            if (check_box?.isChecked == true) {
                text_viev?.text = edit_text?.text
                progres?.incrementProgressBy(10)

            }

        }
    }
}
