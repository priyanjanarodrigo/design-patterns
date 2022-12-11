package com.myorg.dp.implementation.beverageExample;

public abstract class BeverageDecorator extends Beverage {

  protected Beverage beverage;

  public BeverageDecorator(Beverage beverage) {
    this.beverage = beverage;
  }
}
