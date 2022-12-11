package com.myorg.sp.implementation.eager.thredSafe;

public class SingletonEagerThreadSafe {

  private static SingletonEagerThreadSafe instance = new SingletonEagerThreadSafe();

  private SingletonEagerThreadSafe() {
  }

  public static synchronized SingletonEagerThreadSafe getInstance() {
    return instance;
  }
}
