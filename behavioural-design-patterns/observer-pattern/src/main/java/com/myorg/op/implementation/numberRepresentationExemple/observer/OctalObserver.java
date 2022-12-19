package com.myorg.op.implementation.numberRepresentationExemple.observer;

import com.myorg.op.implementation.numberRepresentationExemple.observable.NumberObservable;

public class OctalObserver implements IObserver {

  private NumberObservable numberObservable;

  public OctalObserver(NumberObservable numberObservable) {
    this.numberObservable = numberObservable;
  }

  @Override
  public void update() {
    System.out.println(
        "Octal Observer : " + Integer.toOctalString(this.numberObservable.getState()));
  }
}
