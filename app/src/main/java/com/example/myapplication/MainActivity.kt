package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel

    private lateinit var btn: Button
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: MainRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

        initViewModel()
    }

    private fun initView() {
        this.btn = findViewById(R.id.btn)
        this.btn.setOnClickListener {
            mainViewModel.getData()
        }

        this.recyclerAdapter = MainRecyclerAdapter()
        this.recyclerView = findViewById(R.id.rec)
        this.recyclerView.adapter = recyclerAdapter
        this.recyclerView.layoutManager = LinearLayoutManager(this)

    }

    private fun initViewModel() {
        mainViewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModelImpl::class.java)

        mainViewModel.data.observe(this) {
            this.recyclerAdapter.setItems(it)
        }
    }
}