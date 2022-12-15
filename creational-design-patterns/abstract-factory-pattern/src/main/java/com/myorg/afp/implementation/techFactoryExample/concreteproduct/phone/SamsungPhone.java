package com.myorg.afp.implementation.techFactoryExample.concreteproduct.phone;

import com.myorg.afp.implementation.techFactoryExample.product.SmartPhone;

public abstract class SamsungPhone implements SmartPhone {

  @Override
  public void bootUp() {
    System.out.println("Booting Up... Displaying Samsung Logo");
  }
}
