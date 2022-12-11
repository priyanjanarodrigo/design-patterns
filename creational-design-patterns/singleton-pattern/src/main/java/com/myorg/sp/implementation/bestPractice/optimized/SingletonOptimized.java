package com.myorg.sp.implementation.bestPractice.optimized;

import java.io.Serializable;
import java.util.Objects;

public class SingletonOptimized implements Serializable, Cloneable {

  private static SingletonOptimized instance = null;

  private int value;

  public void setValue(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  private SingletonOptimized() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("Access restricted. Use getInstance() method instead");
    }
  }

  public static SingletonOptimized getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (SingletonOptimized.class) {
        if (Objects.isNull(instance)) {
          instance = new SingletonOptimized();
        }
      }
    }
    return instance;
  }

  // Handling serialization
  public Object readResolve() {
    return instance;
  }

  // Handling cloning
  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException(
        "Singleton class SingletonOptimized is not allowed to be cloned");
  }
}
