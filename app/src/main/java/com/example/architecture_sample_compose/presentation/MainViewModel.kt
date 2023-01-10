package com.example.architecture_sample_compose.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.architecture_sample_compose.domain.SubmitEmail
import com.example.architecture_sample_compose.utils.Resource
import com.example.architecture_sample_compose.utils.UiText
import kotlinx.coroutines.launch

class MainViewModel(
    private val submitEmail: SubmitEmail = SubmitEmail()
): ViewModel() {
    var email by mutableStateOf("")
        private set

    var message by mutableStateOf<UiText?>(null)

    fun onEmailChange(email: String) {
        this.email = email
    }

    fun submit() {
        viewModelScope.launch {
            val result = submitEmail.execute(email)
            message = when(result) {
                is Resource.Success -> {
                    UiText.DynamicString("successfully")
                }
                is Resource.Error -> {
                    result.message
                }
            }
        }
    }
}