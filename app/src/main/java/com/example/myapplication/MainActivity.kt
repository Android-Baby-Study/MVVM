package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel: MainViewModel by viewModels()
        val tvNum: TextView = findViewById(R.id.tv_num)

        findViewById<Button>(R.id.btn_plus).setOnClickListener { mainViewModel.plusNumber() }
        findViewById<Button>(R.id.btn_minus).setOnClickListener { mainViewModel.minusNumber() }
        findViewById<Button>(R.id.btn_reset).setOnClickListener { mainViewModel.resetNumber() }

        mainViewModel.num.observe(this) { tvNum.text = "$it" }
    }
}