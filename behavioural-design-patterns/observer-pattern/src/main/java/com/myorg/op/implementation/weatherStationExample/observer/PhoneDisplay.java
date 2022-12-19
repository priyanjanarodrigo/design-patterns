package com.myorg.op.implementation.weatherStationExample.observer;

import com.myorg.op.implementation.weatherStationExample.observable.WeatherStation;

public class PhoneDisplay implements Observer {

  private WeatherStation observable;

  public PhoneDisplay(WeatherStation observable) {
    this.observable = observable;
  }

  @Override
  public void update() {
    System.out.println("Phone Display -> update() called");
    System.out.println(this.observable.getTemperature());
  }
}
