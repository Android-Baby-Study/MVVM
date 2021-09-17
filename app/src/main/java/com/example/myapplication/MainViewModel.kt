package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

interface IMainViewModel {
    val a: LiveData<Int>

    fun plusNumber()
    fun minusNumber()
    fun resetNumber()
    fun printNumber(): String
}

class MainViewModel : IMainViewModel, ViewModel() {
    private val _a: MutableLiveData<Int> = MutableLiveData(0)
    override val a: LiveData<Int>
        get() = _a

    override fun plusNumber() {
        _a.value = (a.value ?: 0) + 1
    }

    override fun minusNumber() {
        _a.value = (a.value ?: 0) - 1
    }

    override fun resetNumber() {
        _a.value = 0
    }

    override fun printNumber(): String {
        return (a.value ?: 0).toString()
    }
}