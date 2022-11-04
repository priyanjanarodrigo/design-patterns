package com.myorg.sp.practicals.optimized;

import java.io.Serializable;
import java.util.Objects;

public class OptimizedSingleton implements Serializable, Cloneable {
 // https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/?ref=lbp
  private static volatile OptimizedSingleton instance = null;

  private OptimizedSingleton() {
    if (Objects.nonNull(instance)) {
      throw new RuntimeException("Utilize getInstance() static method to obtain the instance");
    }
  }

  public static OptimizedSingleton getInstance() {
    if (Objects.isNull(instance)) {
      synchronized (OptimizedSingleton.class) {
        if (Objects.isNull(instance)) {
          instance = new OptimizedSingleton();
        }
      }
    }
    return instance;
  }

  /**
   * Preventing Singleton class from Serialization.
   *
   * @return Object
   */
  protected Object readResolve() {
    return instance;
  }

  /**
   * Preventing Singleton pattern from cloning.
   *
   * @return Object
   * @throws CloneNotSupportedException
   */
  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException(
        "Singleton class OptimizedSingleton is not allowed to be cloned");
  }
}
