package com.myorg.sp.implementation;

import com.myorg.sp.implementation.strategy.Strategy;

public class Context {
  private Strategy strategy;

  public Context(Strategy strategy) {
    this.strategy = strategy;
  }

  public void executeStrategy(int firstNumber, int secondNumber) {
    System.out.println(this.strategy.doOperation(firstNumber, secondNumber));
  }
}
