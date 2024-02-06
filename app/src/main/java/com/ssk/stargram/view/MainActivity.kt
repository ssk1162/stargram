package com.ssk.stargram.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.ssk.stargram.R
import com.ssk.stargram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.lifecycleOwner = this

        setting()

    }

    private fun setting() {

        supportFragmentManager.beginTransaction().replace(R.id.frame, HomeFragment()).commit()

        binding.bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.fragment_main -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame, HomeFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.fragment_select -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame, SelectFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.fragment_sms -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame, SmsFragment()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.fragment_user -> {
                    supportFragmentManager.beginTransaction().replace(R.id.frame, UserFragment()).commit()
                    return@setOnItemSelectedListener true
                }

            }

            return@setOnItemSelectedListener false

        }
    }

}