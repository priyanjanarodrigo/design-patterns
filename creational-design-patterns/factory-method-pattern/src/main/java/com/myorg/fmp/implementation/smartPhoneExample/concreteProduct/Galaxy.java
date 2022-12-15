package com.myorg.fmp.implementation.smartPhoneExample.concreteProduct;

import com.myorg.fmp.implementation.smartPhoneExample.product.SmartPhone;

public abstract class Galaxy implements SmartPhone {

  @Override
  public void bootUp() {
    System.out.println("Displaying Samsung Logo.. Booting up..");
  }

  public abstract String getDeviceInfo();
}
