package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val mainViewModel: MainViewModel by lazy { ViewModelProvider(
        this,
        ViewModelProvider.NewInstanceFactory()
    ).get(MainViewModelImpl::class.java) }

    private lateinit var recyclerAdapter: MainRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()

        initViewModel()
    }

    private fun initView() {
        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        this.binding.lifecycleOwner = this
        this.binding.vm = this.mainViewModel
        this.binding.activity = this
        this.binding.rec.adapter = MainRecyclerAdapter()
    }

    private fun initViewModel() {

        mainViewModel.data.observe(this) {
            this.recyclerAdapter.setItems(it)
        }
    }
}