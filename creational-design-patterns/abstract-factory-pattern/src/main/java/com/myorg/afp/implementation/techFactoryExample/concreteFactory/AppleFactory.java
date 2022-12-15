package com.myorg.afp.implementation.techFactoryExample.concreteFactory;

import com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop.MacBookProM1;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop.MacBookProM1Pro;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop.MacBookProM1Ultra;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone.IPhone14;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone.IPhone14Plus;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone.IPhone14Pro;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone.IPhone14ProMax;
import com.myorg.afp.implementation.techFactoryExample.factory.TechFactory;
import com.myorg.afp.implementation.techFactoryExample.product.Laptop;
import com.myorg.afp.implementation.techFactoryExample.product.SmartPhone;
import java.util.Objects;

public class AppleFactory implements TechFactory {

  @Override
  public SmartPhone createSmartPhone(String model) {
    if (Objects.isNull(model) || model.isBlank()) {
      return null;
    }

    switch (model) {
      case "iPhone14":
        return new IPhone14();
      case "iPhone14Plus":
        return new IPhone14Plus();
      case "iPhone14Pro":
        return new IPhone14Pro();
      case "iPhone14ProMax":
        return new IPhone14ProMax();
      default:
        throw new RuntimeException("Smart phone : " + model + " is not manufactured at Apple");
    }
  }

  @Override
  public Laptop createLaptop(String model) {
    if (Objects.isNull(model) || model.isBlank()) {
      return null;
    }

    switch (model) {
      case "macBookProM1":
        return new MacBookProM1();
      case "macBookProM1Pro":
        return new MacBookProM1Pro();
      case "macBookProM1Ultra":
        return new MacBookProM1Ultra();
      default:
        throw new RuntimeException("Laptop : " + model + " is not manufactured at Apple");
    }
  }
}
