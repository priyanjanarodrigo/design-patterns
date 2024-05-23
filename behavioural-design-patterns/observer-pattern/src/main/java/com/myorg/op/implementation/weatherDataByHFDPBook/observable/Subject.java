package com.myorg.op.implementation.weatherDataByHFDPBook.observable;

import com.myorg.op.implementation.weatherDataByHFDPBook.observer.Observer;

public interface Subject {

  boolean register(Observer observer);

  boolean unRegister(Observer observer);

  void notifyAllObservers();
}
