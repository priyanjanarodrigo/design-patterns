package com.myorg.nop.implementation.employeeExample;

public class EmployeeNullObjectPatternDemo {

  public static void main(String[] args) {
    Employee firstRealEmployee = EmployeeCreator.create("Roman");
    System.out.print("firstRealEmployee = { isNull: " + firstRealEmployee.isNull() + ", "
        + "name: " + firstRealEmployee.getName() + " }\n");

    Employee secondRealEmployee = EmployeeCreator.create("Kevin");
    System.out.print("secondRealEmployee = { isNull: " + secondRealEmployee.isNull() + ", "
        + "name: " + secondRealEmployee.getName() + " }\n");

    Employee nullEmployee = EmployeeCreator.create("Robert");
    System.out.print("nullEmployee = { isNull: " + nullEmployee.isNull() + ", "
        + "name: " + nullEmployee.getName() + " }\n");
  }
}
