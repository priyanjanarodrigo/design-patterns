package com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop;

public class MacBookProM1Ultra extends AppleLaptop {
  @Override
  public void showGuide() {
    System.out.println("Showing MacBookProM1Ultra user Guide");
  }

  @Override
  public String getSpec() {
    return "MacBookProM1Ultra specification";
  }
}
