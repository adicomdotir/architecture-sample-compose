package com.example.architecture_sample_compose.domain

import com.example.architecture_sample_compose.utils.Resource

interface MyRepository {
    suspend fun submitEmail(email: String): Resource<Unit>
}