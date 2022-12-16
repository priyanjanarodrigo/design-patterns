package com.myorg.sp.practicals.algorithmsExample;

import com.myorg.sp.practicals.algorithmsExample.context.Resolver;
import com.myorg.sp.practicals.algorithmsExample.searchStrategy.BinarySearch;
import com.myorg.sp.practicals.algorithmsExample.sortStrategy.InsertionSort;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class AlgorithmStrategyDemo {

  public static <T> void printArray(T[] array) {
    if (Objects.isNull(array)) {
      throw new RuntimeException("Invalid array input cannot be printed");
    }

    System.out.println(Arrays.stream(array).map(String::valueOf)
        .collect(Collectors.joining(", ", "[ ", " ]")));
  }

  public static void main(String[] args) {
    Resolver resolver = new Resolver(new InsertionSort(), new BinarySearch());

    // NOTE: Integer type internally implements Comparable interface by default.
    Integer[] numbers = new Integer[]{30, 12, 43, 67, 87, 23, 55, 33, 21, 0, -2, 43};

    printArray(numbers);

    resolver.sort(numbers);
    printArray(numbers);

    System.out.println(resolver.search(-2, numbers)); // 0
    System.out.println(resolver.search(87, numbers)); // 11
    System.out.println(resolver.search(43, numbers)); // 8
    System.out.println(resolver.search(90, numbers)); // -1
    System.out.println(resolver.search(-29, numbers)); // -1
  }
}
