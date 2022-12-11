package com.myorg.dp.implementation.beverageExample;

public class PlainCoffee extends Beverage {

  @Override
  public void getDescription() {
    System.out.println("Plain Coffee");
  }

  @Override
  public double getCost() {
    return 10.00d;
  }
}
