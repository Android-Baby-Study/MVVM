package com.example.myapplication

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("android:setItems")
fun setItems(view: View, items: List<User>?) {
    items?.run {
        (((view as RecyclerView).adapter) as MainRecyclerAdapter)?.setItems(this)
    }
}