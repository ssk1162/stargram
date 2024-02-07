package com.ssk.stargram.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    var userId : MutableLiveData<String> = MutableLiveData("")
    var userPassword : MutableLiveData<String> = MutableLiveData("")

    var loginbtn : MutableLiveData<Boolean> = MutableLiveData(false)

    fun login() {
        loginbtn.value = true
    }

}