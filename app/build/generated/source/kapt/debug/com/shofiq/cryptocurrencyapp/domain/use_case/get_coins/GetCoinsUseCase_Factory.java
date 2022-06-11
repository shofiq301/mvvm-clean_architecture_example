// Generated by Dagger (https://dagger.dev).
package com.shofiq.cryptocurrencyapp.domain.use_case.get_coins;

import com.shofiq.cryptocurrencyapp.domain.repository.CoinRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetCoinsUseCase_Factory implements Factory<GetCoinsUseCase> {
  private final Provider<CoinRepository> repositoryProvider;

  public GetCoinsUseCase_Factory(Provider<CoinRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCoinsUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCoinsUseCase_Factory create(Provider<CoinRepository> repositoryProvider) {
    return new GetCoinsUseCase_Factory(repositoryProvider);
  }

  public static GetCoinsUseCase newInstance(CoinRepository repository) {
    return new GetCoinsUseCase(repository);
  }
}
