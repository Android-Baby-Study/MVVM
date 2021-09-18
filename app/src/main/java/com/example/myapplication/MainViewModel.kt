package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

interface MainViewModel {
    val data: LiveData<List<User>>

    fun getData()
}

class MainViewModelImpl : MainViewModel, ViewModel() {
    private val _data: MutableLiveData<List<User>> = MutableLiveData()
    override val data: LiveData<List<User>>
        get() = _data

    override fun getData() {
        val items = ArrayList<User>()
        items.add(User("A1","123123123asdasdasdasdasd"))
        items.add(User("A2","223123123asdasdasdasdasd"))
        items.add(User("A3","323123123asdasdasdasdasd"))
        items.add(User("A4","423123123asdasdasdasdasd"))
        items.add(User("A5","523123123asdasdasdasdasd"))
        items.add(User("A6","623123123asdasdasdasdasd"))
        items.add(User("A7","723123123asdasdasdasdasd"))
        items.add(User("A8","823123123asdasdasdasdasd"))
        items.add(User("A9","923123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        items.add(User("A","123123123asdasdasdasdasd"))
        _data.value = items
    }

}