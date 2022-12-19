package com.myorg.op.implementation.weatherStationExample;

import com.myorg.op.implementation.weatherStationExample.observable.WeatherStation;
import com.myorg.op.implementation.weatherStationExample.observer.Observer;
import com.myorg.op.implementation.weatherStationExample.observer.PhoneDisplay;

public class WeatherStationObserverPatternDemo {

  public static void main(String[] args) {
    // Creating the Observable (which is WeatherStation)
    WeatherStation observable = new WeatherStation();

    // Creating Subscriber(s)
    Observer phoneDisplaySubscriber = new PhoneDisplay(observable);

    // Registering the Observer to Observable (Observer/ Subscriber subscribes to Observable)
    observable.register(phoneDisplaySubscriber);

    // Setting up initial state
    observable.setTemperature(10.12);

    // Notifying Subscribers/ Observers
    observable.notifyObservers();

    // Changing the state
    observable.setTemperature(-2.34);

    // Notifying Subscribers/ Observers again after the change of state
    observable.notifyObservers();
  }
}
