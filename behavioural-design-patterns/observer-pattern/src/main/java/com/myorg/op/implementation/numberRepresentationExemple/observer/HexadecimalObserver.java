package com.myorg.op.implementation.numberRepresentationExemple.observer;

import com.myorg.op.implementation.numberRepresentationExemple.observable.NumberObservable;

public class HexadecimalObserver implements IObserver {

  private NumberObservable numberObservable;

  public HexadecimalObserver(NumberObservable numberObservable) {
    this.numberObservable = numberObservable;
  }

  @Override
  public void update() {
    System.out.println(
        "Hexadecimal Observer : " + Integer.toHexString(this.numberObservable.getState()));
  }
}
