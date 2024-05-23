package com.myorg.op.implementation.weatherDataByHFDPBook.observer;

public interface Observer {

  void update(float temperature, float humidity, float pressure);
}
