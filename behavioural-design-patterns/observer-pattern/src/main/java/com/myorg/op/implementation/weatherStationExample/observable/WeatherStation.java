package com.myorg.op.implementation.weatherStationExample.observable;

import com.myorg.op.implementation.weatherStationExample.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

  private double temperature;

  private List<Observer> observerList;

  public WeatherStation() {
    this.observerList = new ArrayList<>();
  }

  public void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  public double getTemperature() {
    return this.temperature;
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
  public void notifyObservers() {
    System.out.println("Notifying all Observers/ Subscribers");
    for (Observer observer : observerList) {
      observer.update();
    }
  }
}
