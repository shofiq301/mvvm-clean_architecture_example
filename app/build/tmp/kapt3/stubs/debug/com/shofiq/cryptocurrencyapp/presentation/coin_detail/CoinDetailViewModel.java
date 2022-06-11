package com.shofiq.cryptocurrencyapp.presentation.coin_detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/shofiq/cryptocurrencyapp/presentation/coin_detail/CoinDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "getCoinUseCase", "Lcom/shofiq/cryptocurrencyapp/domain/use_case/get_coin/GetCoinUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/shofiq/cryptocurrencyapp/domain/use_case/get_coin/GetCoinUseCase;Landroidx/lifecycle/SavedStateHandle;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/shofiq/cryptocurrencyapp/presentation/coin_detail/CoinDetailState;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getCoin", "", "coinId", "", "app_debug"})
public final class CoinDetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.shofiq.cryptocurrencyapp.domain.use_case.get_coin.GetCoinUseCase getCoinUseCase = null;
    private final androidx.compose.runtime.MutableState<com.shofiq.cryptocurrencyapp.presentation.coin_detail.CoinDetailState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.shofiq.cryptocurrencyapp.presentation.coin_detail.CoinDetailState> state = null;
    
    @javax.inject.Inject()
    public CoinDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.shofiq.cryptocurrencyapp.domain.use_case.get_coin.GetCoinUseCase getCoinUseCase, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.shofiq.cryptocurrencyapp.presentation.coin_detail.CoinDetailState> getState() {
        return null;
    }
    
    private final void getCoin(java.lang.String coinId) {
    }
}