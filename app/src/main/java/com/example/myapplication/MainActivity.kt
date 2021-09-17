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

        findViewById<Button>(R.id.btn_plus).apply {
            this.setOnClickListener {
                plusBtnClick()
            }
        }
        findViewById<Button>(R.id.btn_minus).apply {
            this.setOnClickListener {
                minusBtnClick()
            }
        }
        findViewById<Button>(R.id.btn_reset).apply {
            this.setOnClickListener {
                resetBtnClick()
            }
        }

        tvNum = findViewById(R.id.tv_num)

        mainViewModel.a.observe(this) { number ->
            tvNum.text = "$number"
        }
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