package com.example.myapplication

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

interface MainViewModel {

}

class MainViewModelImpl(val name: String) : MainViewModel, ViewModel() {

}