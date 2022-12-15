package com.myorg.fmp.implementation.smartPhoneExample.creator;

import com.myorg.fmp.implementation.smartPhoneExample.product.SmartPhone;

public interface SmartPhoneFactory {
  SmartPhone createSmartPhone(String model);
}
