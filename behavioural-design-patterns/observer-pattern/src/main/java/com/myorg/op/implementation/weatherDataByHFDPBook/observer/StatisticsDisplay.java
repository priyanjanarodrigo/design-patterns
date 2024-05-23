package com.myorg.op.implementation.weatherDataByHFDPBook.observer;

import com.myorg.op.implementation.weatherDataByHFDPBook.observable.Subject;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, IDisplayElement {

  private float temperature;
  private float humidity;
  private float pressure;
  List<String> statisticsList;
  private Subject weatherData;

  public StatisticsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    this.statisticsList = new ArrayList<>();
    weatherData.register(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    this.statisticsList.add(LocalDate.now() + " --> " +
        "{ temperature: " + this.temperature + "| humidity: " + this.humidity
        + ", pressure: " + this.pressure + " }");
    display();
  }

  @Override
  public void display() {
    System.out.println("StatisticsDisplay : ");
    statisticsList.stream().forEach(data -> System.out.println(data));
    System.out.println();
  }
}
