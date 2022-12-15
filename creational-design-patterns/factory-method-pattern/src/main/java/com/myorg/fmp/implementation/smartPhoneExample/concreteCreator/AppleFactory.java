package com.myorg.fmp.implementation.smartPhoneExample.concreteCreator;

import com.myorg.fmp.implementation.smartPhoneExample.concreteProduct.IPhone14;
import com.myorg.fmp.implementation.smartPhoneExample.concreteProduct.IPhone14Plus;
import com.myorg.fmp.implementation.smartPhoneExample.concreteProduct.IPhone14Pro;
import com.myorg.fmp.implementation.smartPhoneExample.concreteProduct.IPhone14ProMax;
import com.myorg.fmp.implementation.smartPhoneExample.creator.SmartPhoneFactory;
import com.myorg.fmp.implementation.smartPhoneExample.product.SmartPhone;
import java.util.Objects;

public class AppleFactory implements SmartPhoneFactory {

  @Override
  public SmartPhone createSmartPhone(String model) {
    if (Objects.isNull(model) || model.isBlank()) {
      return null;
    }

    SmartPhone smartPhone;

    switch (model) {
      case "iPhone14": {
        smartPhone = new IPhone14();
      }
      break;
      case "iPhone14Plus": {
        smartPhone = new IPhone14Plus();
      }
      break;
      case "iPhone14Pro": {
        smartPhone = new IPhone14Pro();
      }
      break;
      case "iPhone14ProMax": {
        smartPhone = new IPhone14ProMax();
      }
      break;
      default: {
        throw new RuntimeException("Provided model " + model + " is not created in Apple");
      }
    }

    return smartPhone;
  }
}
