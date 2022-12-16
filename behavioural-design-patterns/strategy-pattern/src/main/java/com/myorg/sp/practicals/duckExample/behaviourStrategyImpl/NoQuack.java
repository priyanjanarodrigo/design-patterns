package com.myorg.sp.practicals.duckExample.behaviourStrategyImpl;

import com.myorg.sp.practicals.duckExample.behaviourStrategy.IQuackBehaviour;

public class NoQuack implements IQuackBehaviour {
  @Override
  public void quack() {
    System.out.println("No Quack/Silent ...!");
  }
}
