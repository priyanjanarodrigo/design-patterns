package com.myorg.fp.implementation.hotel;

import com.myorg.fp.implementation.menu.Menu;
import com.myorg.fp.implementation.menu.MixedMenu;

public class MixedRestaurant implements Hotel {

  @Override
  public Menu getMenu() {
    return new MixedMenu();
  }
}
