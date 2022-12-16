package com.myorg.sp.practicals.algorithmsExample.sortStrategy;

import java.util.Objects;

public class InsertionSort implements ISortStrategy {

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    if (Objects.isNull(array) || array.length == 0) {
      throw new RuntimeException("Invalid array input");
    }

    for (int i = 1; i < array.length; ++i) {
      T key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j].compareTo(key) > 0) {
        array[j + 1] = array[j];
        j = j - 1;
      }
      array[j + 1] = key;
    }
  }
}
