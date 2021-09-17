package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels

class MainActivity : AppCompatActivity() {
    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var tvNum: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_plus).setOnClickListener { plusBtnClick() }
        findViewById<Button>(R.id.btn_minus).setOnClickListener { minusBtnClick() }
        findViewById<Button>(R.id.btn_reset).setOnClickListener { resetBtnClick() }

        tvNum = findViewById(R.id.tv_num)

        mainViewModel.num.observe(this) { tvNum.text = "$it" }
    }

    private fun plusBtnClick() {
        mainViewModel.plusNumber()
    }

    private fun minusBtnClick() {
        mainViewModel.minusNumber()
    }

    private fun resetBtnClick() {
        mainViewModel.resetNumber()
    }
}