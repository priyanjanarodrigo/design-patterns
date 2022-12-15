package com.myorg.fmp.implementation.smartPhoneExample.concreteProduct;

import com.myorg.fmp.implementation.smartPhoneExample.product.SmartPhone;

public abstract class IPhone implements SmartPhone {

  @Override
  public void bootUp() {
    System.out.println("Displaying Apple Logo.. Booting up..");
  }

  public abstract String getDeviceInfo();
}
