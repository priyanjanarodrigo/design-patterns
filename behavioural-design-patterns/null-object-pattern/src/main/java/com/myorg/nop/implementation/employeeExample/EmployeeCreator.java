package com.myorg.nop.implementation.employeeExample;

import java.util.List;

public class EmployeeCreator {

  public static final List<String> names = List.of("Kevin", "Dwayne", "Roman");

  public static Employee create(String name) {

    for (int i = 0; i < names.size(); i++) {
      if (names.get(i).equals(name)) {
        return new RealEmployee(name);
      }
    }
    return new NullEmployee();
  }
}
