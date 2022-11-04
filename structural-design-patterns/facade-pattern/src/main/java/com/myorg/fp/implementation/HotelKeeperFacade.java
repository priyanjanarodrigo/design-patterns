package com.myorg.fp.implementation;

import com.myorg.fp.implementation.hotel.MixedRestaurant;
import com.myorg.fp.implementation.hotel.NonVegetarianRestaurant;
import com.myorg.fp.implementation.hotel.VegetarianRestaurant;
import com.myorg.fp.implementation.menu.MixedMenu;
import com.myorg.fp.implementation.menu.NonVegetarianMenu;
import com.myorg.fp.implementation.menu.VegetarianMenu;

public class HotelKeeperFacade {

  public VegetarianMenu getVegetarianMenu() {
    VegetarianRestaurant vegetarianRestaurant = new VegetarianRestaurant();
    return (VegetarianMenu) vegetarianRestaurant.getMenu();
  }

  public NonVegetarianMenu getNonVegetarianMenu() {
    NonVegetarianRestaurant nonVegetarianRestaurant = new NonVegetarianRestaurant();
    return (NonVegetarianMenu) nonVegetarianRestaurant.getMenu();
  }

  public MixedMenu getMixedMenu() {
    MixedRestaurant mixedRestaurant = new MixedRestaurant();
    return (MixedMenu) mixedRestaurant.getMenu();
  }
}
