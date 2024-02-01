package com.example.abbhishekcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1:EditText = findViewById(R.id.num1)
        val num2:EditText = findViewById(R.id.num2)
        val add:Button = findViewById(R.id.button01)
        val sub: Button=findViewById(R.id.button02)
        val multi:Button=findViewById(R.id.button03)
        val div:Button=findViewById(R.id.button04)

        add.setOnClickListener {
            val n1 = num1.text.toString()
            val n2= num2.text.toString()
            val n3= (n1.toInt()+n2.toInt())
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("result",n3)
            startActivity(intent)
        }
        sub.setOnClickListener {
            val n1 = num1.text.toString()
            val n2= num2.text.toString()
            val n3= (n1.toInt()-n2.toInt())
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("result",n3)
            startActivity(intent)
        }
        multi.setOnClickListener {
            val n1 = num1.text.toString()
            val n2= num2.text.toString()
            val n3= (n1.toInt()*n2.toInt())
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("result",n3)
            startActivity(intent)
        }
        div.setOnClickListener {
            val n1 = num1.text.toString()
            val n2= num2.text.toString()
            val n3= (n1.toInt()/n2.toInt())
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("result",n3)
            startActivity(intent)
        }
    }
}