package com.myorg.sp.practicals.coreVariations.eager.nonThreadSafe;

public class SingletonEagerNonThreadSafe {
  private static volatile SingletonEagerNonThreadSafe instance = new SingletonEagerNonThreadSafe();

  private SingletonEagerNonThreadSafe() {
  }

  public static SingletonEagerNonThreadSafe getInstance() {
    return instance;
  }
}
