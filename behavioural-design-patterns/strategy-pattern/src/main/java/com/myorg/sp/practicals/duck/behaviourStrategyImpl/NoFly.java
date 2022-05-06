package com.myorg.sp.practicals.duck.behaviourStrategyImpl;

import com.myorg.sp.practicals.duck.behaviourStrategy.IFlyBehaviour;

public class NoFly implements IFlyBehaviour {
  @Override
  public void fly() {
    System.out.println("No Fly ...!");
  }
}
