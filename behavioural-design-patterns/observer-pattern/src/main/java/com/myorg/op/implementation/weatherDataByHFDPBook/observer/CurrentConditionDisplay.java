package com.myorg.op.implementation.weatherDataByHFDPBook.observer;

import com.myorg.op.implementation.weatherDataByHFDPBook.observable.Subject;

public class CurrentConditionDisplay implements Observer, IDisplayElement {

  private float temperature;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public CurrentConditionDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    weatherData.register(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  @Override
  public void display() {
    System.out.println(
        "CurrentConditionDisplay = { temperature: " + this.temperature + ", humidity: "
            + this.humidity
            + ", pressure: " + this.pressure + " }");
  }
}
