package com.myorg.nop.implementation.customerExample;

public class CustomerFactory {
  private static final String[] names = {"Roman", "Rock", "cena", "ambrose", "seth", "brock"};

  public static AbstractCustomer getCustomer(String customerName) {
    for (String name : names) {
      if (name.equalsIgnoreCase(customerName)) {
        return new RealCustomer(customerName);
      }
    }
    return new NullCustomer();
  }
}
