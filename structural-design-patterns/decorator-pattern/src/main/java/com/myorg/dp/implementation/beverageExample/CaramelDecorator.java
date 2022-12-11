package com.myorg.dp.implementation.beverageExample;

public class CaramelDecorator extends BeverageDecorator {

  public CaramelDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public void getDescription() {
    beverage.getDescription();
    System.out.println("Caramel Included");
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 0.99d;
  }
}
