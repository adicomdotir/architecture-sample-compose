package com.example.architecture_sample_compose.data

import com.example.architecture_sample_compose.domain.MyRepository
import com.example.architecture_sample_compose.utils.Resource
import com.example.architecture_sample_compose.utils.UiText
import kotlinx.coroutines.delay
import kotlin.random.Random

class MyRepositoryImpl : MyRepository {
    override suspend fun submitEmail(email: String): Resource<Unit> {
        delay(500)
        return if (Random.nextBoolean()) {
            Resource.Success(Unit)
        } else {
            if (Random.nextBoolean()) {
                Resource.Error(
                    UiText.DynamicString("Not authenticated")
                )
            } else {
                Resource.Error(
                    UiText.DynamicString("Server Error")
                )
            }
        }
    }
}