package com.example.lec3_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark=findViewById<Button>(R.id.btnDark)
        val buttonRead=findViewById<Button>(R.id.btnread)
        val layout=findViewById<LinearLayout>(R.id.linearLayout)


        buttonDark.setOnClickListener {
            Toast.makeText(applicationContext,"Turning dark..",Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.black)
        }

        buttonRead.setOnClickListener {
            Toast.makeText(applicationContext,"Turning light..",Toast.LENGTH_SHORT).show()
            layout.setBackgroundResource(R.color.yellow)
        }

    }
}