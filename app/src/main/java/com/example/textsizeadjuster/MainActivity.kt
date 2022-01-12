package com.example.textsizeadjuster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var initialfontsize = 14f
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<TextView>(R.id.name)
        val maximize = findViewById<Button>(R.id.maximize)
        val minimize = findViewById<Button>(R.id.minimize)

        maximize.setOnClickListener{
            initialfontsize +=14f
            name.setTextSize(TypedValue.COMPLEX_UNIT_SP,initialfontsize);
        }
        minimize.setOnClickListener {
            initialfontsize -=14f
            name.setTextSize(TypedValue.COMPLEX_UNIT_SP,initialfontsize);

        }
    }
}