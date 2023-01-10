package com.example.architecture_sample_compose.domain

import com.example.architecture_sample_compose.data.MyRepositoryImpl
import com.example.architecture_sample_compose.utils.Resource
import com.example.architecture_sample_compose.utils.UiText

class SubmitEmail(
    private val repository: MyRepository = MyRepositoryImpl()
) {
    suspend fun execute(email: String): Resource<Unit> {
        if (!email.contains("@")) {
            return Resource.Error(
                UiText.DynamicString("Invalid Email")
            )
        }
        return repository.submitEmail(email)
    }
}