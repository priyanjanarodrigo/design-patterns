package com.myorg.afp.implementation.techFactoryExample;

import com.myorg.afp.implementation.techFactoryExample.concreteFactory.AppleFactory;
import com.myorg.afp.implementation.techFactoryExample.concreteFactory.SamsungFactory;
import com.myorg.afp.implementation.techFactoryExample.factory.TechFactory;
import com.myorg.afp.implementation.techFactoryExample.product.Laptop;
import com.myorg.afp.implementation.techFactoryExample.product.SmartPhone;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    // Creating abstract factory instance
    TechFactory techFactory = new AppleFactory();

    // Creating object instances using that particular abstract factory instance
    SmartPhone smartPhone = techFactory.createSmartPhone("iPhone14ProMax");
    smartPhone.bootUp();
    System.out.println(smartPhone.getInfo() + "\n");

    Laptop laptop = techFactory.createLaptop("macBookProM1Pro");
    laptop.showGuide();
    System.out.println(laptop.getSpec() + "\n");

    // Switching the abstract factory dynamically at runtime
    techFactory = new SamsungFactory();

    smartPhone = techFactory.createSmartPhone("galaxyS22");
    smartPhone.bootUp();
    System.out.println(smartPhone.getInfo() + "\n");

    laptop = techFactory.createLaptop("galaxyBookPro");
    laptop.showGuide();
    System.out.println(laptop.getSpec());
  }
}
