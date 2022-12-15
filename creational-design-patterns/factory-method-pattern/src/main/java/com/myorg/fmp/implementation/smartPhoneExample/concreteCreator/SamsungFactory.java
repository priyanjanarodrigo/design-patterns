package com.myorg.fmp.implementation.smartPhoneExample.concreteCreator;

import com.myorg.fmp.implementation.smartPhoneExample.concreteProduct.GalaxyS22;
import com.myorg.fmp.implementation.smartPhoneExample.concreteProduct.GalaxyS22Plus;
import com.myorg.fmp.implementation.smartPhoneExample.concreteProduct.GalaxyS22Ultra;
import com.myorg.fmp.implementation.smartPhoneExample.creator.SmartPhoneFactory;
import com.myorg.fmp.implementation.smartPhoneExample.product.SmartPhone;
import java.util.Objects;

public class SamsungFactory implements SmartPhoneFactory {

  @Override
  public SmartPhone createSmartPhone(String model) {
    if (Objects.isNull(model) || model.isBlank()) {
      return null;
    }

    SmartPhone smartPhone;

    switch (model) {
      case "galaxyS22": {
        smartPhone = new GalaxyS22();
      }
      break;
      case "galaxyS22Plus": {
        smartPhone = new GalaxyS22Plus();
      }
      break;
      case "galaxyS22Ultra": {
        smartPhone = new GalaxyS22Ultra();
      }
      break;
      default: {
        throw new RuntimeException("Provided model " + model + " is not created in Samsung");
      }
    }

    return smartPhone;
  }
}
