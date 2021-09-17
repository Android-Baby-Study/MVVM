package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

interface IMainViewModel {
    val num: LiveData<Int>

    fun plusNumber()
    fun minusNumber()
    fun resetNumber()
}

class MainViewModel : IMainViewModel, ViewModel() {
    private val _num: MutableLiveData<Int> = MutableLiveData(0)
    override val num: LiveData<Int>
        get() = _num

    override fun plusNumber() {
        _num.value = (num.value ?: 0) + 1
    }

    override fun minusNumber() {
        _num.value = (num.value ?: 0) - 1
    }

    override fun resetNumber() {
        _num.value = 0
    }
}