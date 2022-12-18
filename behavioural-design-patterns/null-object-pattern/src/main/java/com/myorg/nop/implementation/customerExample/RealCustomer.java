package com.myorg.nop.implementation.customerExample;

public class RealCustomer extends AbstractCustomer {
  public RealCustomer(String name) {
    this.name = name;
  }

  @Override
  public boolean isNull() {
    return false;
  }

  @Override
  public String getName() {
    return this.name;
  }
}
