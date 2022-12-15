package com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop;

public class MacBookProM1Pro extends AppleLaptop {
  @Override
  public void showGuide() {
    System.out.println("Showing MacBookProM1Pro user Guide");
  }

  @Override
  public String getSpec() {
    return "MacBookProM1Pro specification";
  }
}
