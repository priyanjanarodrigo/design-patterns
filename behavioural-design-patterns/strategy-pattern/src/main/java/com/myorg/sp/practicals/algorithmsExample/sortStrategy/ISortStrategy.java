package com.myorg.sp.practicals.algorithmsExample.sortStrategy;

public interface ISortStrategy {

  <T extends Comparable<T>> void sort(T[] array);
}
