package com.newbiexpert.android_kotlin_learnviewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var total: Int = 0

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int) {
        total += input
    }
}