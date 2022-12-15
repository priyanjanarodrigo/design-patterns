package com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop;

public class GalaxyBookPro extends SamsungLaptop {

  @Override
  public void showGuide() {
    System.out.println("Showing GalaxyBookPro user Guide");
  }

  @Override
  public String getSpec() {
    return "GalaxyBookPro specification";
  }
}
