package com.myorg.afp.implementation.techFactoryExample.factory;

import com.myorg.afp.implementation.techFactoryExample.product.Laptop;
import com.myorg.afp.implementation.techFactoryExample.product.SmartPhone;

public interface TechFactory {

  SmartPhone createSmartPhone(String model);

  Laptop createLaptop(String model);
}
