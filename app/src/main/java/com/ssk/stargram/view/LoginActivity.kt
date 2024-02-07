package com.ssk.stargram.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.ssk.stargram.R
import com.ssk.stargram.databinding.ActivityLoginBinding
import com.ssk.stargram.viewModel.UserViewModel

class LoginActivity : AppCompatActivity() {

    lateinit var binding : ActivityLoginBinding

    val userViewModel : UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)

        binding.lifecycleOwner = this
        binding.viewModel = userViewModel

        setObserve()

    }

    private fun setObserve() {
        userViewModel.loginbtn.observe(this) {
            if (it) {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }

}