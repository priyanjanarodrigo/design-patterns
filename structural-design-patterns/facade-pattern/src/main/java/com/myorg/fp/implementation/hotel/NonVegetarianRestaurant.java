package com.myorg.fp.implementation.hotel;

import com.myorg.fp.implementation.menu.Menu;
import com.myorg.fp.implementation.menu.NonVegetarianMenu;

public class NonVegetarianRestaurant implements Hotel {

  @Override
  public Menu getMenu() {
    return new NonVegetarianMenu();
  }
}
