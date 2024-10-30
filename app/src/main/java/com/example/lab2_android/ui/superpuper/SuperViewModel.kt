package com.example.lab2_android.ui.superpuper

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SuperViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is superpuper Fragment"
    }
    val text: LiveData<String> = _text
}