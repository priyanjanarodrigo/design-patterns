package com.myorg.sp.practicals.coreVariations.lazy.nonThreadSafe;

import java.util.Objects;

public class SingletonLazyNonThreadSafe {
  private static volatile SingletonLazyNonThreadSafe instance;

  private SingletonLazyNonThreadSafe() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("instance must be obtained by calling getInstance() method");
    }
  }

  private static SingletonLazyNonThreadSafe getInstance() {
    if (Objects.isNull(instance)) {
      instance = new SingletonLazyNonThreadSafe();
    }
    return instance;
  }
}
