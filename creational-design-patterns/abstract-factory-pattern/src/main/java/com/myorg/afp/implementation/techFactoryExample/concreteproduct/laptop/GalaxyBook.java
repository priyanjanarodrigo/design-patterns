package com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop;

public class GalaxyBook extends SamsungLaptop {

  @Override
  public void showGuide() {
    System.out.println("Showing GalaxyBook user Guide");
  }

  @Override
  public String getSpec() {
    return "GalaxyBook specification";
  }
}
