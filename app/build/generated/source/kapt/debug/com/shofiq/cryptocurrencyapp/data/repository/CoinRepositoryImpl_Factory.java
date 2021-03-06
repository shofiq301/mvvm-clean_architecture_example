// Generated by Dagger (https://dagger.dev).
package com.shofiq.cryptocurrencyapp.data.repository;

import com.shofiq.cryptocurrencyapp.data.remote.CoinPaprikaApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CoinRepositoryImpl_Factory implements Factory<CoinRepositoryImpl> {
  private final Provider<CoinPaprikaApi> apiProvider;

  public CoinRepositoryImpl_Factory(Provider<CoinPaprikaApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public CoinRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static CoinRepositoryImpl_Factory create(Provider<CoinPaprikaApi> apiProvider) {
    return new CoinRepositoryImpl_Factory(apiProvider);
  }

  public static CoinRepositoryImpl newInstance(CoinPaprikaApi api) {
    return new CoinRepositoryImpl(api);
  }
}
