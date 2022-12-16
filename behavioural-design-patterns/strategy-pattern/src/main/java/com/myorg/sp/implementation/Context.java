package com.myorg.sp.implementation;

import com.myorg.sp.implementation.strategy.Strategy;

public class Context {
  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public int executeStrategy(int firstNumber, int secondNumber) {
   return this.strategy.doOperation(firstNumber, secondNumber);
  }
}
