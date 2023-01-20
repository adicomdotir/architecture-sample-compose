package com.example.architecture_sample_compose.di

import android.app.Application
import com.example.architecture_sample_compose.common.Constants
import com.example.architecture_sample_compose.data.data_source.CoinPaprikaApi
import com.example.architecture_sample_compose.data.repository.CoinRepositoryImpl
import com.example.architecture_sample_compose.domain.repository.CoinRepository
import com.example.architecture_sample_compose.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}