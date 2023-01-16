package com.example.architecture_sample_compose.data.data_source

import com.example.architecture_sample_compose.data.data_source.dto.CoinDetailDto
import com.example.architecture_sample_compose.data.data_source.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("/v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId: String): CoinDetailDto
}