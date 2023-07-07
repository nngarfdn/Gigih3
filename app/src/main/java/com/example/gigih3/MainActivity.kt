package com.example.gigih3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.gigih3.State.*
import com.example.gigih3.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    private val TAG = "MainActivityTAG"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        //list kalo arraylist bisa di add
        //kalo bukan tidak bisa

        val listPerson = arrayListOf<Person>()
        val name1 = Person("Nanang")
        val name2 = Person("Arifudin", 20)

        name2.apply {
            //akses langsung
            val name = name
        }
        val sampelNull: String? = null
        listPerson.add(name1)
        listPerson.add(name2)
        with(binding){
            txt2.gone()
            txtInfo.text = name1.name
        }
        
        val state = LOADING

        when (state) {
            LOADING -> Log.d(TAG, "onCreate: loadingg")
            EMPTY -> Log.d(TAG, "onCreate: EMPTY")
            SUCCESS -> Log.d(TAG, "onCreate: SUCCESS")
        }
        
        Log.d(TAG, "onCreate: ${name1.name}")
        Log.d(TAG, "onCreate null sample: $sampelNull")
        Log.d(TAG, "onCreate elvis: ${sampelNull ?: "haloo"}")
    }
}