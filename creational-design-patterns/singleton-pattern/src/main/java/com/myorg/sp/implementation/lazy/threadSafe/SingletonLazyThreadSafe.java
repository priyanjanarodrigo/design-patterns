package com.myorg.sp.implementation.lazy.threadSafe;

import java.util.Objects;

public class SingletonLazyThreadSafe {

  private static SingletonLazyThreadSafe instance = null;

  private SingletonLazyThreadSafe() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("Access restricted. use getInstance() method instead");
    }
  }

  public static synchronized SingletonLazyThreadSafe getInstance() {
    if (Objects.isNull(instance)) {
      instance = new SingletonLazyThreadSafe();
    }
    return instance;
  }
}
