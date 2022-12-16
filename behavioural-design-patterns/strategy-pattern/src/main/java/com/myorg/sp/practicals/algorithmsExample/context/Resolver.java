package com.myorg.sp.practicals.algorithmsExample.context;

import com.myorg.sp.practicals.algorithmsExample.searchStrategy.ISearchStrategy;
import com.myorg.sp.practicals.algorithmsExample.sortStrategy.ISortStrategy;

public class Resolver {

  private ISortStrategy sortStrategy;

  private ISearchStrategy searchStrategy;

  public Resolver(ISortStrategy sortStrategy, ISearchStrategy searchStrategy) {
    this.sortStrategy = sortStrategy;
    this.searchStrategy = searchStrategy;
  }

  public <T extends Comparable<T>> void sort(T[] array) {
    this.sortStrategy.sort(array);
  }

  public <T extends Comparable<T>> int search(T key, T[] array) {
    return searchStrategy.search(key, array);
  }
}
