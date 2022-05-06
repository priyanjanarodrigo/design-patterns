package com.myorg.sp.practicals.coreVariations.doubleCheckedLocking;

import java.util.Objects;

public class SingletonDoubleCheckedLockingThreadSafe {
  private static volatile SingletonDoubleCheckedLockingThreadSafe instance;

  private SingletonDoubleCheckedLockingThreadSafe() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("instance must be obtained through getInstance() method");
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
