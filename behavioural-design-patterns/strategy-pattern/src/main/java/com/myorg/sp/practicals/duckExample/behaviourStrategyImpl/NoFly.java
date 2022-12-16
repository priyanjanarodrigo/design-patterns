package com.myorg.sp.practicals.duckExample.behaviourStrategyImpl;

import com.myorg.sp.practicals.duckExample.behaviourStrategy.IFlyBehaviour;

public class NoFly implements IFlyBehaviour {
  @Override
  public void fly() {
    System.out.println("No Fly ...!");
  }
}
