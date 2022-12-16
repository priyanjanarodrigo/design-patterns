package com.myorg.sp.practicals.duckExample;

import com.myorg.sp.practicals.duckExample.behaviourStrategy.IDisplayBehaviour;
import com.myorg.sp.practicals.duckExample.behaviourStrategy.IFlyBehaviour;
import com.myorg.sp.practicals.duckExample.behaviourStrategy.IQuackBehaviour;

public class Duck {
  private IQuackBehaviour quackBehaviour;

  private IDisplayBehaviour displayBehaviour;

  private IFlyBehaviour flyBehaviour;

  public Duck(IQuackBehaviour quackBehaviour, IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour) {
    this.quackBehaviour = quackBehaviour;
    this.displayBehaviour = displayBehaviour;
    this.flyBehaviour = flyBehaviour;
  }

  public void executeBehaviour() {
    quackBehaviour.quack();
    displayBehaviour.display();
    flyBehaviour.fly();
  }
}
