package com.example.architecture_sample_compose.domain.util

sealed class OrderType{
    object Ascending:OrderType()
    object Descending:OrderType()
}
