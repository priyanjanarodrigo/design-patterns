package com.myorg.op.implementation.weatherStationExample.observable;

import com.myorg.op.implementation.weatherStationExample.observer.Observer;

public interface IObservable {

  boolean register(Observer observer);

  boolean unRegister(Observer observer);

  void notifyObservers();
}
