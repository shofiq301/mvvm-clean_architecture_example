package com.shofiq.cryptocurrencyapp.presentation.coin_detail

import com.shofiq.cryptocurrencyapp.domain.model.Coin
import com.shofiq.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
    )
