package com.myorg.sp.implementation.eager.nonThreadSafe;

public class SingletonEagerNonThreadSafe {

  private static SingletonEagerNonThreadSafe instance = new SingletonEagerNonThreadSafe();

  private SingletonEagerNonThreadSafe() {
  }

  public static SingletonEagerNonThreadSafe getInstance() {
    return instance;
  }
}
