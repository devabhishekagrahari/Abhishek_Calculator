package com.example.abbhishekcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val result:TextView=findViewById(R.id.result)
        val n3:Int?
        n3=intent.getIntExtra("result",0)
        result.text= ("Answer =" +(n3).toString())

    }


}