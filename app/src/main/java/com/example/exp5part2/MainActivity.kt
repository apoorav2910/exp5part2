package com.example.exp5part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var ch1 : CheckBox
    lateinit var ch2 : CheckBox
    lateinit var ch3 : CheckBox
    lateinit var ch4 : CheckBox
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ch1 = findViewById(R.id.ch1)
        ch2 = findViewById(R.id.ch2)
        ch3 = findViewById(R.id.ch3)
        ch4 = findViewById(R.id.ch4)
        btn = findViewById(R.id.btn)

        btn.setOnClickListener(){
            Check()
        }
    }

    fun Check(){
        var msg : String = ""
        if (ch1.isChecked){
            msg += "Android Studio "
        }
        if (ch2.isChecked){
            msg += "Visual Studio "
        }
        if (ch3.isChecked){
            msg += "Eclipse IDE "
        }
        if (ch4.isChecked){
            msg += "Google Colab "
        }

        Toast.makeText(this, "$msg has been selected by you", Toast.LENGTH_LONG).show()

    }
}