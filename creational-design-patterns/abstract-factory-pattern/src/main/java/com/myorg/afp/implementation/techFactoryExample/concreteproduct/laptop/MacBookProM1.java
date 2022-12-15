package com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop;

public class MacBookProM1 extends AppleLaptop {
  @Override
  public void showGuide() {
    System.out.println("Showing MacBookProM1 user Guide");
  }

  @Override
  public String getSpec() {
    return "MacBookProM1 specification";
  }
}
