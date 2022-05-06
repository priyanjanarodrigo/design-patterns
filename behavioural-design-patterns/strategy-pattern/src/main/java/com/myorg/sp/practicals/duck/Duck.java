package com.myorg.sp.practicals.duck;

import com.myorg.sp.practicals.duck.behaviourStrategy.IDisplayBehaviour;
import com.myorg.sp.practicals.duck.behaviourStrategy.IFlyBehaviour;
import com.myorg.sp.practicals.duck.behaviourStrategy.IQuackBehaviour;

public class Duck {
  private IQuackBehaviour quackBehaviour;

  private IDisplayBehaviour displayBehaviour;

  private IFlyBehaviour flyBehaviour;

  public Duck(IQuackBehaviour quackBehaviour, IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour) {
    this.quackBehaviour = quackBehaviour;
    this.displayBehaviour = displayBehaviour;
    this.flyBehaviour = flyBehaviour;
  }

  public void executeBheviour() {
    quackBehaviour.quack();
    displayBehaviour.display();
    flyBehaviour.fly();
  }
}
