package com.shofiq.cryptocurrencyapp.domain.repository

import com.shofiq.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.shofiq.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}