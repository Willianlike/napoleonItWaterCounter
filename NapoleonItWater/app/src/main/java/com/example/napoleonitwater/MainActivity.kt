package com.example.napoleonitwater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countTV: TextView = findViewById(R.id.tv_main_count)
        val addCountTV: TextView = findViewById(R.id.tv_addition_count)

        countTV.setOnClickListener {
            countTV.text = (countTV.text.toString().toLongOrNull() ?: 0).toString()
        }
        addCountTV.setOnClickListener {
            countTV.text = (countTV.text.toString().toLongOrNull() ?: 0).toString()
        }

        val addBtn: Button = findViewById(R.id.add_button)
        addBtn.setOnClickListener {
            val addCount: Long = addCountTV.text.toString().toLongOrNull() ?: 0
            val newCount: Long = (countTV.text.toString().toLongOrNull() ?: 0) + addCount
            println(addCount)
            println(newCount)
            countTV.text = newCount.toString()
        }

        val minusBtn: Button = findViewById(R.id.minus_button)
        minusBtn.setOnClickListener {
            val addCount: Long = addCountTV.text.toString().toLongOrNull() ?: 0
            val newCount: Long = (countTV.text.toString().toLongOrNull() ?: 0) - addCount
            countTV.text = newCount.toString()
        }
    }
}
