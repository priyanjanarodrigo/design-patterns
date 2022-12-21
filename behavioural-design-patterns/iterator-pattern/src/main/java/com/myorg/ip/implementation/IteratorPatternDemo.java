package com.myorg.ip.implementation;

import com.myorg.ip.implementation.iterable.Iterable;
import com.myorg.ip.implementation.iterable.JobCollection;
import com.myorg.ip.implementation.iterator.Iterator;

public class IteratorPatternDemo {

  public static void main(String[] args) {
    Iterable jobIterable = new JobCollection(
        new String[]{"Software Engineer", "Chef", "Accountant"});

    Iterator jobIterator = jobIterable.getIterator();

    while (jobIterator.hasNext()) {
      System.out.println(jobIterator.next());
    }
  }
}
