package com.myorg.dp.implementation.beverageExample;

public class Espresso extends Beverage {

  @Override
  public void getDescription() {
    System.out.println("Espresso");
  }

  @Override
  public double getCost() {
    return 20.50d;
  }
}
