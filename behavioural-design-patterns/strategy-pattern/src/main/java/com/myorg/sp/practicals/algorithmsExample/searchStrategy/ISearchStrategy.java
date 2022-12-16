package com.myorg.sp.practicals.algorithmsExample.searchStrategy;

public interface ISearchStrategy {

  <T extends Comparable<T>> int search(T key, T[] array);
}
