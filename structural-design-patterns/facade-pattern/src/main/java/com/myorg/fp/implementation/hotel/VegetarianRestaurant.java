package com.myorg.fp.implementation.hotel;

import com.myorg.fp.implementation.menu.Menu;
import com.myorg.fp.implementation.menu.VegetarianMenu;

public class VegetarianRestaurant implements Hotel {

  @Override
  public Menu getMenu() {
    return new VegetarianMenu();
  }
}
