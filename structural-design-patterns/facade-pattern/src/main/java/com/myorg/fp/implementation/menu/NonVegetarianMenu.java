package com.myorg.fp.implementation.menu;

import java.util.Map;

public class NonVegetarianMenu implements Menu {

  @Override
  public Map<String, Double> getItems() {
    return Map.of("Beef Burger", 899.99, "Chicken Soup", 500d);
  }
}
