package com.shofiq.cryptocurrencyapp;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = CoinApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface CoinApplication_GeneratedInjector {
  void injectCoinApplication(CoinApplication coinApplication);
}
