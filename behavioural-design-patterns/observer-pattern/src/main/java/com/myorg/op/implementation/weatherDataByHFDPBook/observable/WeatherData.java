package com.myorg.op.implementation.weatherDataByHFDPBook.observable;

import com.myorg.op.implementation.weatherDataByHFDPBook.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observerList;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observerList = new ArrayList<>();
  }

  @Override
  public boolean register(Observer observer) {
    return this.observerList.add(observer);
  }

  @Override
  public boolean unRegister(Observer observer) {
    return this.observerList.remove(observer);
  }

  @Override
  public void notifyAllObservers() {
    observerList.forEach(
        observer -> observer.update(this.temperature, this.humidity, this.pressure));
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    notifyAllObservers();
  }
}
