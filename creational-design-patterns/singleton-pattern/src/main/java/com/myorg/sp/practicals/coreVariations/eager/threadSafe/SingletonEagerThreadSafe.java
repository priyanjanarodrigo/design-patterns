package com.myorg.sp.practicals.coreVariations.eager.threadSafe;

public class SingletonEagerThreadSafe {
  private static volatile SingletonEagerThreadSafe instance = new SingletonEagerThreadSafe();

  private SingletonEagerThreadSafe() {
  }

  public static synchronized SingletonEagerThreadSafe getInstance() {
    return instance;
  }
}
