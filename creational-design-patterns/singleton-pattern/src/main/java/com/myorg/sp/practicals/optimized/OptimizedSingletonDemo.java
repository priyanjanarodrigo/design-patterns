package com.myorg.sp.practicals.optimized;

import java.lang.reflect.Constructor;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class OptimizedSingletonDemo {

  public static void main(String[] args) {
    executeReflectionPreventionCode();
    executeCloningPreventionCode();
    executeSerializationPreventionCode();
  }

  public static void executeSerializationPreventionCode() {
    OptimizedSingleton serializedInstance = OptimizedSingleton.getInstance();
    try {
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(
          new FileOutputStream("optimizedSingleton.text"));
      objectOutputStream.writeObject(serializedInstance);
      objectOutputStream.close();

      ObjectInputStream objectInputStream = new ObjectInputStream(
          new FileInputStream("optimizedSingleton.text"));
      objectInputStream.close();

      OptimizedSingleton deserializedInstance = (OptimizedSingleton) objectInputStream.readObject();

      System.out.println(serializedInstance.hashCode());
      System.out.println(deserializedInstance.hashCode());
      System.out.println(serializedInstance.hashCode() == deserializedInstance.hashCode());
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  public static void executeCloningPreventionCode() {
    OptimizedSingleton originalInstance = OptimizedSingleton.getInstance();
    OptimizedSingleton clonedInstance;

    try {
      clonedInstance = (OptimizedSingleton) originalInstance.clone();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  public static void executeReflectionPreventionCode() {
    OptimizedSingleton instance1 = OptimizedSingleton.getInstance();
    OptimizedSingleton instance2;

    Constructor[] constructors = OptimizedSingleton.class.getDeclaredConstructors();

    try {
      for (Constructor constructor : constructors) {
        constructor.setAccessible(true);
        instance2 = (OptimizedSingleton) constructor.newInstance();
      }
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
