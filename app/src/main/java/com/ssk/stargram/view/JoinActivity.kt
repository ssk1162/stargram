package com.ssk.stargram.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.ssk.stargram.R
import com.ssk.stargram.databinding.ActivityJoinBinding
import com.ssk.stargram.databinding.ActivityLoginBinding
import com.ssk.stargram.viewModel.UserViewModel

class JoinActivity : AppCompatActivity() {

    lateinit var binding : ActivityJoinBinding

    private val userViewModel : UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_join)

        binding.lifecycleOwner = this
        binding.viewModel = userViewModel

        setObserve()

    }

    private fun setObserve() {
        userViewModel.backbtn.observe(this) {
            if (it) {
                startActivity(Intent(this, LoginActivity::class.java))
            }
        }
    }

}