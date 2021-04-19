package com.example.tipcalculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipcalculatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener{ calculateTip() }
    }

    private fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()

//        Get the tip percentage
    }
}