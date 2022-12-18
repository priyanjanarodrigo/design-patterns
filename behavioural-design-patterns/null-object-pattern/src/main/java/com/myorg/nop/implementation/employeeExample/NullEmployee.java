package com.myorg.nop.implementation.employeeExample;

public class NullEmployee extends Employee {

  @Override
  public boolean isNull() {
    return true;
  }

  @Override
  public String getName() {
    return "NOT AVAILABLE !";
  }
}
