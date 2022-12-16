package com.myorg.sp.practicals.algorithmsExample.sortStrategy;

import java.util.Objects;

public class BubbleSort implements ISortStrategy {

  @Override
  public <T extends Comparable<T>> void sort(T[] array) {
    if (Objects.isNull(array) || array.length == 0) {
      throw new RuntimeException("Invalid array input");
    }

    boolean swapped;
    T temp;

    for (int i = 0; i < array.length - 1; i++) {
      swapped = false;
      for (int j = 0; j < array.length - 1 - i; j++) {
        int comparisonResult = array[j].compareTo(array[j + 1]);
        if (comparisonResult > 0) {
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }
}
