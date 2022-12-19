package com.myorg.op.implementation.numberRepresentationExemple.observable;

import com.myorg.op.implementation.numberRepresentationExemple.observer.IObserver;
import java.util.ArrayList;
import java.util.List;

public class NumberObservable implements IObservable {

  private int number;

  private List<IObserver> observerList;

  public int getState() {
    return this.number;
  }

  public void setState(int number) {
    this.number = number;
    this.notifyAllObservers();
  }

  public NumberObservable() {
    this.observerList = new ArrayList<>();
  }

  @Override
  public boolean register(IObserver observer) {
    return this.observerList.add(observer);
  }

  @Override
  public boolean unRegister(IObserver observer) {
    return this.observerList.remove(observer);
  }

  @Override
  public void notifyAllObservers() {
    if (!observerList.isEmpty()) {
      for (IObserver observer : observerList) {
        observer.update();
      }
    }
  }
}
