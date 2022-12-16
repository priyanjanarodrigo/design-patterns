package com.myorg.sp.practicals.duckExample;

import com.myorg.sp.practicals.duckExample.behaviourStrategy.IDisplayBehaviour;
import com.myorg.sp.practicals.duckExample.behaviourStrategy.IFlyBehaviour;
import com.myorg.sp.practicals.duckExample.behaviourStrategy.IQuackBehaviour;

public class RubberDuck extends Duck {

  public RubberDuck(IQuackBehaviour quackBehaviour, IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour) {
    super(quackBehaviour, displayBehaviour, flyBehaviour);
  }
}
