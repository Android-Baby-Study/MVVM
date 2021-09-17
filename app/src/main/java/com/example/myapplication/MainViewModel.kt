package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

interface MainViewModelInterface {
    val num: LiveData<Int>

    fun plusNum()
    fun minusNum()
    fun initNum()
}

class MainViewModel: ViewModel(), MainViewModelInterface {
    private val _num: MutableLiveData<Int> = MutableLiveData(0)
    override val num: LiveData<Int>
        get() = _num

    override fun plusNum() {
        _num.value = (_num.value ?: 0) + 1
    }

    override fun minusNum() {
        _num.value = (_num.value ?: 0) - 1
    }

    override fun initNum() {
        _num.value = 0
    }
}