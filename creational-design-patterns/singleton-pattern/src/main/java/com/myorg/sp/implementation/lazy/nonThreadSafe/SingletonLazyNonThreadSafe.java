package com.myorg.sp.implementation.lazy.nonThreadSafe;

import java.util.Objects;

public class SingletonLazyNonThreadSafe {

  private static SingletonLazyNonThreadSafe instance = null;

  private SingletonLazyNonThreadSafe() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("Access restricted. use getInstance() method instead");
    }
  }

  private static SingletonLazyNonThreadSafe getInstance() {
    if (Objects.isNull(instance)) {
      instance = new SingletonLazyNonThreadSafe();
    }
    return instance;
  }
}
