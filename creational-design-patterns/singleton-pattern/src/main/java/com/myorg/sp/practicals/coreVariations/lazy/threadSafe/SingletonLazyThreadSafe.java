package com.myorg.sp.practicals.coreVariations.lazy.threadSafe;

import java.util.Objects;

public class SingletonLazyThreadSafe {
  private static volatile SingletonLazyThreadSafe instance;

  private SingletonLazyThreadSafe() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("instance must be obtained through getInstance() method");
    }
  }

  public static synchronized SingletonLazyThreadSafe getInstance() {
    if (Objects.isNull(instance)) {
      instance = new SingletonLazyThreadSafe();
    }
    return instance;
  }
}
