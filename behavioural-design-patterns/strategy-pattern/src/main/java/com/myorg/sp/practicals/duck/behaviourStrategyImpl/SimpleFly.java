package com.myorg.sp.practicals.duck.behaviourStrategyImpl;

import com.myorg.sp.practicals.duck.behaviourStrategy.IFlyBehaviour;

public class SimpleFly implements IFlyBehaviour {
  @Override
  public void fly() {
    System.out.println("Simple Fly ...!");
  }
}
