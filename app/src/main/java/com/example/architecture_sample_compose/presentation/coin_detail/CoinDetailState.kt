package com.example.architecture_sample_compose.presentation.coin_detail

import com.example.architecture_sample_compose.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
