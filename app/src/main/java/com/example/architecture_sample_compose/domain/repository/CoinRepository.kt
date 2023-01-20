package com.example.architecture_sample_compose.domain.repository

import com.example.architecture_sample_compose.data.data_source.dto.CoinDetailDto
import com.example.architecture_sample_compose.data.data_source.dto.CoinDto

//interface CoinRepository {
//    suspend fun getCoins(): List<CoinDto>
//
//    suspend fun getCoinById(coinId: String): CoinDetailDto
//}

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}