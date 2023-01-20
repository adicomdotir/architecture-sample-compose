package com.example.architecture_sample_compose.data.repository

import com.example.architecture_sample_compose.data.data_source.CoinPaprikaApi
import com.example.architecture_sample_compose.data.data_source.dto.CoinDetailDto
import com.example.architecture_sample_compose.data.data_source.dto.CoinDto
import com.example.architecture_sample_compose.domain.repository.CoinRepository
import javax.inject.Inject

//class CoinRepositoryImpl @Inject constructor(
//  private val api: CoinPaprikaApi
//) : CoinRepository {
//    override suspend fun getCoins(): List<CoinDto> {
//        return api.getCoins()
//    }
//
//    override suspend fun getCoinById(coinId: String): CoinDetailDto {
//        return api.getCoinById(coinId)
//    }
//
//}

class CoinRepositoryImpl(
    private val api: CoinPaprikaApi,
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}