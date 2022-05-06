package com.myorg.sp.implementation.strategyImpl;

import com.myorg.sp.implementation.strategy.Strategy;

public class AddingStrategy implements Strategy {
  @Override
  public int doOperation(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }
}
