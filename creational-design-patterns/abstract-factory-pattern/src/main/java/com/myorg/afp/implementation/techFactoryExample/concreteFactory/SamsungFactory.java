package com.myorg.afp.implementation.techFactoryExample.concreteFactory;

import com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop.GalaxyBook;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.laptop.GalaxyBookPro;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone.GalaxyS22;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone.GalaxyS22Plus;
import com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone.GalaxyS22Ultra;
import com.myorg.afp.implementation.techFactoryExample.factory.TechFactory;
import com.myorg.afp.implementation.techFactoryExample.product.Laptop;
import com.myorg.afp.implementation.techFactoryExample.product.SmartPhone;
import java.util.Objects;

public class SamsungFactory implements TechFactory {

  @Override
  public SmartPhone createSmartPhone(String model) {
    if (Objects.isNull(model) || model.isBlank()) {
      return null;
    }

    switch (model) {
      case "galaxyS22":
        return new GalaxyS22();
      case "galaxyS22Plus":
        return new GalaxyS22Plus();
      case "galaxyS22Ultra":
        return new GalaxyS22Ultra();
      default:
        throw new RuntimeException("Smart phone : " + model + " is not manufactured at Samsung");
    }
  }

  @Override
  public Laptop createLaptop(String model) {
    if (Objects.isNull(model) || model.isBlank()) {
      return null;
    }

    switch (model) {
      case "galaxyBook":
        return new GalaxyBook();
      case "galaxyBookPro":
        return new GalaxyBookPro();
      default:
        throw new RuntimeException("Laptop : " + model + " is not manufactured at Samsung");
    }
  }
}
