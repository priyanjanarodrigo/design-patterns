package com.myorg.fmp.implementation.smartPhoneExample;

import com.myorg.fmp.implementation.smartPhoneExample.concreteCreator.AppleFactory;
import com.myorg.fmp.implementation.smartPhoneExample.concreteCreator.SamsungFactory;
import com.myorg.fmp.implementation.smartPhoneExample.creator.SmartPhoneFactory;
import com.myorg.fmp.implementation.smartPhoneExample.product.SmartPhone;

public class SmartPhoneFactoryMethodDemo {

  public static void main(String[] args) {
    SmartPhoneFactory smartPhoneFactory = new AppleFactory();
    SmartPhone smartPhone = smartPhoneFactory.createSmartPhone("iPhone14Pro");
    smartPhone.bootUp();
    System.out.println(smartPhone.getDeviceInfo() + "\n");

    smartPhoneFactory = new SamsungFactory(); // Switching the factory dynamically at runtime
    smartPhone = smartPhoneFactory.createSmartPhone("galaxyS22Ultra");
    smartPhone.bootUp();
    System.out.println(smartPhone.getDeviceInfo() + "\n");

    // Proceeding to create an invalid device through SamsungFactory
    try {
      // Asking SamsungFactory to create iPhone14, which is an invalid creation scenario
      smartPhone = smartPhoneFactory.createSmartPhone("iPhone14");
    } catch (Exception exception) {
      System.out.println(exception.getMessage() + "\n");
    }

    // Proceeding to create an invalid device through AppleFactory
    smartPhoneFactory = new AppleFactory(); // Setting up factory back as AppleFactory
    try {
      // Asking AppleFactory to create iPhone14, which is an invalid creation scenario
      smartPhone = smartPhoneFactory.createSmartPhone("galaxyS22Ultra");
    } catch (Exception exception) {
      System.out.println(exception.getMessage());
    }
  }
}
