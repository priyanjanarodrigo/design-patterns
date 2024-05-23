package com.myorg.op.implementation.weatherDataByHFDPBook;

import com.myorg.op.implementation.weatherDataByHFDPBook.observable.WeatherData;
import com.myorg.op.implementation.weatherDataByHFDPBook.observer.CurrentConditionDisplay;
import com.myorg.op.implementation.weatherDataByHFDPBook.observer.Observer;
import com.myorg.op.implementation.weatherDataByHFDPBook.observer.StatisticsDisplay;

public class WeatherDataByHFDPBookDemo {

  public static void main(String[] args) {
    // Instantiating the observable/subjects
    WeatherData weatherData = new WeatherData();

    // Instantiating the observers (Observer self registration/attachment to the observable is internally done)
    Observer currentConditionsDisplay = new CurrentConditionDisplay(weatherData);
    Observer statisticsDisplay = new StatisticsDisplay(weatherData);

    weatherData.setMeasurements(15.23f, 3.11f, 12.43f);
    weatherData.setMeasurements(-13.93f, 44.33f, 90.01f);

    // Unregistering statisticsDisplay observer
    weatherData.unRegister(statisticsDisplay);
    weatherData.setMeasurements(-2f, 33f, 23.32f);
  }
}
