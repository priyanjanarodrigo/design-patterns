package com.myorg.dp.implementation.beverageExample;

public class SoyMilkDecorator extends BeverageDecorator {

  public SoyMilkDecorator(Beverage beverage) {
    super(beverage);
  }

  @Override
  public void getDescription() {
    beverage.getDescription();
    System.out.println("Soy Milk Included");
  }

  @Override
  public double getCost() {
    return beverage.getCost() + 4.66d;
  }
}
