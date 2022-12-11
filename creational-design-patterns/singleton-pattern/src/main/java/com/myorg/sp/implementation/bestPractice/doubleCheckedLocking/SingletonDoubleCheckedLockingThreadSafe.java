package com.myorg.sp.implementation.bestPractice.doubleCheckedLocking;

import java.util.Objects;

public class SingletonDoubleCheckedLockingThreadSafe {

  private static SingletonDoubleCheckedLockingThreadSafe instance = null;

  private SingletonDoubleCheckedLockingThreadSafe() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("Access restricted. Use getInstance() method instead");
    }
  }

  public static SingletonDoubleCheckedLockingThreadSafe getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (SingletonDoubleCheckedLockingThreadSafe.class) {
        if (Objects.isNull(instance)) {
          instance = new SingletonDoubleCheckedLockingThreadSafe();
        }
      }
    }
    return instance;
  }
}
