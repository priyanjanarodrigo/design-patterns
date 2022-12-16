package com.myorg.sp.practicals.algorithmsExample.searchStrategy;

import java.util.Objects;

public class BinarySearch implements ISearchStrategy {

  @Override
  public <T extends Comparable<T>> int search(T key, T[] array) {
    if (Objects.isNull(array) || array.length < 1) {
      throw new RuntimeException("Invalid array input");
    }

    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int comparisonResult = key.compareTo(array[mid]);

      if (comparisonResult > 0) {
        low = mid + 1;
      } else if (comparisonResult < 0) {
        high = mid - 1;
      } else {
        return mid;
      }
    }

    return -1;
  }
}
