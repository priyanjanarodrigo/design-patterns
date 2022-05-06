package com.myorg.sp.practicals.duck.behaviourStrategyImpl;

import com.myorg.sp.practicals.duck.behaviourStrategy.IFlyBehaviour;

public class JetFly implements IFlyBehaviour {
  @Override
  public void fly() {
    System.out.println("Jet Fly ...!");
  }
}
