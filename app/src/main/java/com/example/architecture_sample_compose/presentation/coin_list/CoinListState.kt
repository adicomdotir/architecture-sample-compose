package com.example.architecture_sample_compose.presentation.coin_list

import com.example.architecture_sample_compose.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
