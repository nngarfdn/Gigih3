package com.example.gigih3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gigih3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            txt2.gone()
        }

    }
}