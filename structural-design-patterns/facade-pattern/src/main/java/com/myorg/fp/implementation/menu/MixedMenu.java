package com.myorg.fp.implementation.menu;

import java.util.HashMap;
import java.util.Map;

public class MixedMenu implements Menu {

  @Override
  public Map<String, Double> getItems() {
    Map<String, Double> mixedMenu = new HashMap<>();
    VegetarianMenu vegetarianMenu = new VegetarianMenu();
    NonVegetarianMenu nonVegetarianMenu = new NonVegetarianMenu();

    vegetarianMenu.getItems().entrySet()
        .forEach(itemEntry -> mixedMenu.put(itemEntry.getKey(), itemEntry.getValue()));

    nonVegetarianMenu.getItems().entrySet()
        .forEach(itemEntry -> mixedMenu.put(itemEntry.getKey(), itemEntry.getValue()));

    return mixedMenu;
  }
}
