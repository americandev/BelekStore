package com.example.hggg.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class loginViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "login"
    }
    val text: LiveData<String> = _text
}