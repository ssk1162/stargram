package com.ssk.stargram.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class UserViewModel : ViewModel() {

//    var auth = FirebaseAuth.getInstance()

    var userId : MutableLiveData<String> = MutableLiveData("")
    var userPassword : MutableLiveData<String> = MutableLiveData("")

    var loginbtn : MutableLiveData<Boolean> = MutableLiveData(false)
    var backbtn : MutableLiveData<Boolean> = MutableLiveData(false)
    var joinbtn : MutableLiveData<Boolean> = MutableLiveData(false)

    var message = MutableLiveData("")


    fun join() {
//        if (userId.value.equals("") || userPassword.value.equals("")) {
//            message.value = "공백이 있습니다 확인해 주세요"
//        } else {
//            auth.createUserWithEmailAndPassword(userId.value.toString(), userPassword.value.toString()).addOnSuccessListener {
//                message.value = "회원가입 성공 ${it.user?.email}"
//                loginbtn.value = true
//            }.addOnFailureListener {
//                message.value = "회원가입 실패 ${it.message}"
//            }
//        }
    }

    fun login() {
//        if (userId.value.equals("") || userPassword.value.equals("")) {
//            message.value = "공백이 있습니다 확인해 주세요"
//        } else {
//            auth.signInWithEmailAndPassword(userId.value.toString(), userPassword.value.toString()).addOnSuccessListener {
//                message.value = "로그인 성공 ${it.user?.email}"
//                loginbtn.value = true
//            }.addOnFailureListener {
//                message.value = "로그인 실패 ${it.message}"
//            }
//        }
    }

    fun back() {
        backbtn.value = true
    }

    fun joinbtn() {
        joinbtn.value = true
    }

    fun selectId() {

    }

}