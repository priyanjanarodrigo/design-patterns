package com.myorg.sp.practicals.algorithmsExample.searchStrategy;

import java.util.Objects;

public class LinearSearch implements ISearchStrategy {

  @Override
  public <T extends Comparable<T>> int search(T key, T[] array) {
    if (Objects.isNull(array) || array.length < 1) {
      throw new RuntimeException("Invalid array input");
    }

    for (int i = 0; i < array.length; i++) {
      if (key.compareTo(array[i]) == 0) {
        return i;
      }
    }

    return -1;
  }
}
