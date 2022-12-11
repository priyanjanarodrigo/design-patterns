package com.myorg.sp.implementation.bestPractice.optimized;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonOptimizedDemo {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    SingletonOptimized singletonOptimized = SingletonOptimized.getInstance();
    singletonOptimized.setValue(12);

    SingletonOptimized singletonOptimizedSecondReference = SingletonOptimized.getInstance();

    System.out.println("singletonOptimized hashCode() : " + singletonOptimized.hashCode());
    System.out.println("singletonOptimizedSecondReference hashCode() : "
        + singletonOptimizedSecondReference.hashCode());
    System.out.println(
        "singletonOptimized.hashCode() == singletonOptimizedSecondReference.hashCode() : " + (
            singletonOptimized.hashCode() == singletonOptimizedSecondReference.hashCode()));

    System.out.println("\nsingletonOptimized.getValue() : " + singletonOptimized.getValue());
    System.out.println("singletonOptimizedSecondReference.getValue() : "
        + singletonOptimizedSecondReference.getValue());
    System.out.println(
        "singletonOptimized.getValue() ==  singletonOptimizedSecondReference.getValue() : " + (
            singletonOptimized.getValue() == singletonOptimizedSecondReference.getValue()));

    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
    objectOutputStream.writeObject(SingletonOptimized.getInstance());
    objectOutputStream.close();

    singletonOptimizedSecondReference.setValue(20);

    System.out.println("\nsingletonOptimized.getValue() : " + singletonOptimized.getValue());
    System.out.println("singletonOptimizedSecondReference.getValue() : "
        + singletonOptimizedSecondReference.getValue());
    System.out.println(
        "singletonOptimized.getValue() ==  singletonOptimizedSecondReference.getValue() : " + (
            singletonOptimized.getValue() == singletonOptimizedSecondReference.getValue()));

    InputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
    SingletonOptimized deserializedSingletonOptimized = (SingletonOptimized) objectInputStream.readObject();

    System.out.println("\nsingletonOptimized hashCode() : " + singletonOptimized.hashCode());
    System.out.println("singletonOptimizedSecondReference hashCode() : "
        + singletonOptimizedSecondReference.hashCode());
    System.out.println("deserializedSingletonOptimized hashCode() : " + deserializedSingletonOptimized.hashCode());
    System.out.println(
        "singletonOptimizedSecondReference.hashCode() == deserializedSingletonOptimized.hashCode() : " + (
            singletonOptimizedSecondReference.hashCode() == deserializedSingletonOptimized.hashCode()));


    System.out.println("\nsingletonOptimized.getValue() : " + singletonOptimized.getValue());
    System.out.println("singletonOptimizedSecondReference.getValue() : "
        + singletonOptimizedSecondReference.getValue());
    System.out.println("deserializedSingletonOptimized.getValue() : "
        + deserializedSingletonOptimized.getValue());
  }
}
