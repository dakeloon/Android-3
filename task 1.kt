package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1:TextView = findViewById(R.id.textView)
        val text2:TextView = findViewById(R.id.textView2)
        val text3:TextView = findViewById(R.id.textView3)
        val text4:TextView = findViewById(R.id.textView4)
        val text5:TextView = findViewById(R.id.textView5)
        val text6:TextView = findViewById(R.id.textView6)
        val text7:TextView = findViewById(R.id.textView7)
        val text8:TextView = findViewById(R.id.textView8)
        val text9:TextView = findViewById(R.id.textView9)
        val button:Button = findViewById(R.id.button)

        button.setOnClickListener() {
            if (text1.text != "") {
                val num:Int = text1.text.toString().toInt()
                text2.text = (num + 1).toString()
                text5.text = (num + 1).toString()
                text8.text = (num + 1).toString()
                text1.text = ""
                text4.text = ""
                text7.text = ""
            }
            else if (text2.text != "") {
                val num:Int = text2.text.toString().toInt()
                text3.text = (num + 1).toString()
                text6.text = (num + 1).toString()
                text9.text = (num + 1).toString()
                text2.text = ""
                text5.text = ""
                text8.text = ""
            }
            else if (text3.text != "") {
                val num:Int = text3.text.toString().toInt()
                text1.text = (num + 1).toString()
                text4.text = (num + 1).toString()
                text7.text = (num + 1).toString()
                text3.text = ""
                text6.text = ""
                text9.text = ""
            }
        }

    }
}
