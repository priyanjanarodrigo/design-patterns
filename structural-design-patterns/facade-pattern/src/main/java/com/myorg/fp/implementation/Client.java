package com.myorg.fp.implementation;

import com.myorg.fp.implementation.menu.MixedMenu;
import com.myorg.fp.implementation.menu.NonVegetarianMenu;
import com.myorg.fp.implementation.menu.VegetarianMenu;

public class Client {

  public static void main(String[] args) {
    HotelKeeperFacade hotelKeeperFacade = new HotelKeeperFacade();

    VegetarianMenu vegetarianMenu = hotelKeeperFacade.getVegetarianMenu();
    System.out.println("\nvegetarianMenu:");
    vegetarianMenu.getItems().entrySet().forEach(System.out::println);

    NonVegetarianMenu nonVegetarianMenu = hotelKeeperFacade.getNonVegetarianMenu();
    System.out.println("\nnonVegetarianMenu:");
    nonVegetarianMenu.getItems().entrySet().forEach(System.out::println);

    MixedMenu mixedMenu = hotelKeeperFacade.getMixedMenu();
    System.out.println("\nmixedMenu:");
    mixedMenu.getItems().entrySet().forEach(System.out::println);
  }
}
