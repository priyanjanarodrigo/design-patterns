package com.myorg.op.implementation.numberRepresentationExemple.observer;

import com.myorg.op.implementation.numberRepresentationExemple.observable.NumberObservable;

public class BinaryObserver implements IObserver {

  private NumberObservable numberObservable;

  public BinaryObserver(NumberObservable numberObservable) {
    this.numberObservable = numberObservable;
  }

  @Override
  public void update() {
    System.out.println("Binary Observer : " + Integer.toBinaryString(numberObservable.getState()));
  }
}
