package com.myorg.nop.implementation.employeeExample;

public class RealEmployee extends Employee {

  public RealEmployee(String name) {
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
