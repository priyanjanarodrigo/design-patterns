package com.myorg.sp.implementation.strategyImpl;

import com.myorg.sp.implementation.strategy.Strategy;

public class SubstractingStrategy implements Strategy {
  @Override
  public int doOperation(int firstNumber, int secondNumber) {
    if (firstNumber < secondNumber) {
      throw new RuntimeException("firstNumber must be greater than or equal to secondNumber in order to substract");
    }
    return firstNumber - secondNumber;
  }
}
