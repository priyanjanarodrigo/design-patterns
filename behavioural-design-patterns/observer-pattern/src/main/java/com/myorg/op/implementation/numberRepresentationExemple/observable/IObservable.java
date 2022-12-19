package com.myorg.op.implementation.numberRepresentationExemple.observable;

import com.myorg.op.implementation.numberRepresentationExemple.observer.IObserver;

public interface IObservable {

  boolean register(IObserver observer);

  boolean unRegister(IObserver observer);

  void notifyAllObservers();
}
