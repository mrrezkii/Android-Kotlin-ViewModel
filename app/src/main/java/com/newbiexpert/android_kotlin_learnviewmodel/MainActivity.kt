package com.newbiexpert.android_kotlin_learnviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.newbiexpert.android_kotlin_learnviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.countText.text = count.toString()
        binding.button.setOnClickListener {
            count++
            binding.countText.text = count.toString()
        }
    }
}