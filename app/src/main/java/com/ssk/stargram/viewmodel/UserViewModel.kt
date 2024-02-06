package com.ssk.stargram.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {

    private val userId : MutableLiveData<String> = MutableLiveData("")
    private val userPassword : MutableLiveData<String> = MutableLiveData("")



}