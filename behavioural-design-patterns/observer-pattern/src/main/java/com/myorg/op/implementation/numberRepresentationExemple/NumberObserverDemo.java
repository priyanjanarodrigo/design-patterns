package com.myorg.op.implementation.numberRepresentationExemple;

import com.myorg.op.implementation.numberRepresentationExemple.observable.NumberObservable;
import com.myorg.op.implementation.numberRepresentationExemple.observer.BinaryObserver;
import com.myorg.op.implementation.numberRepresentationExemple.observer.HexadecimalObserver;
import com.myorg.op.implementation.numberRepresentationExemple.observer.IObserver;
import com.myorg.op.implementation.numberRepresentationExemple.observer.OctalObserver;

public class NumberObserverDemo {

  public static void main(String[] args) {
    NumberObservable numberObservable = new NumberObservable();

    IObserver binaryObserver = new BinaryObserver(numberObservable);
    IObserver octalObserver = new OctalObserver(numberObservable);
    IObserver hexadecimalObserver = new HexadecimalObserver(numberObservable);

    numberObservable.register(binaryObserver);
    numberObservable.register(octalObserver);
    numberObservable.register(hexadecimalObserver);

    // This method internally  calls notifyAllObservers() method.
    numberObservable.setState(2);
    System.out.println();

    numberObservable.setState(1101);
    System.out.println();

    // binary observer is un registered/ detached from here onwards
    numberObservable.unRegister(binaryObserver);

    // When this line is executed, BinaryObserver will not be notified as it was detached
    numberObservable.setState(100);
  }

  /**
   * Program Output:
   * ---------------
   *
   * Binary Observer : 10
   * Octal Observer : 2
   * Hexadecimal Observer : 2
   *
   * Binary Observer : 10001001101
   * Octal Observer : 2115
   * Hexadecimal Observer : 44d
   *
   * Octal Observer : 144
   * Hexadecimal Observer : 64
   */
}
