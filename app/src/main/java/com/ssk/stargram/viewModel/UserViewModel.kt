package com.ssk.stargram.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    val userId : MutableLiveData<String> = MutableLiveData("")
    val userPassword : MutableLiveData<String> = MutableLiveData("")



}