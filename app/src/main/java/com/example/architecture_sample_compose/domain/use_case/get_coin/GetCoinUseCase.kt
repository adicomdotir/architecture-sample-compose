package com.example.architecture_sample_compose.domain.use_case.get_coin

import com.example.architecture_sample_compose.common.Resource
import com.example.architecture_sample_compose.data.data_source.dto.toCoin
import com.example.architecture_sample_compose.data.data_source.dto.toCoinDetail
import com.example.architecture_sample_compose.domain.model.Coin
import com.example.architecture_sample_compose.domain.model.CoinDetail
import com.example.architecture_sample_compose.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

//class GetCoinUseCase @Inject constructor(
//    private val repository: CoinRepository
//) {
//    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
//        try {
//            emit(Resource.Loading())
//            val coin = repository.getCoinById(coinId).toCoinDetail()
//            emit(Resource.Success(coin))
//        } catch (e: HttpException) {
//            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
//        } catch (e: IOException) {
//            emit(Resource.Error("Couldn't reach server. Check your internet connection"))
//        }
//    }
//}

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository,
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> {
        return flow {
            try {
                emit(Resource.Loading())
                val coin = repository.getCoinById(coinId).toCoinDetail()
                emit(Resource.Success(coin))
            } catch (e: HttpException) {
                emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server. Check your internet connection"))
            }
        }
    }
}