package com.myorg.fp.implementation.menu;

import java.util.Map;

public class VegetarianMenu implements Menu {

  @Override
  public Map<String, Double> getItems() {
    return Map.of("Vegetable Salad", 2599.99, "Dhal Curry", 450.00);
  }
}
