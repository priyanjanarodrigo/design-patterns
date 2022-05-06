package com.myorg.sp.practicals.duck;

import com.myorg.sp.practicals.duck.behaviourStrategy.IDisplayBehaviour;
import com.myorg.sp.practicals.duck.behaviourStrategy.IFlyBehaviour;
import com.myorg.sp.practicals.duck.behaviourStrategy.IQuackBehaviour;

public class NaturalDuck extends Duck {
  public NaturalDuck(IQuackBehaviour quackBehaviour, IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour) {
    super(quackBehaviour, displayBehaviour, flyBehaviour);
  }
}
