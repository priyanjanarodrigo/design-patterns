package com.myorg.sp.practicals.duckExample.behaviourStrategyImpl;

import com.myorg.sp.practicals.duckExample.behaviourStrategy.IQuackBehaviour;

public class SimpleQuack implements IQuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Simple Quack ...!");
  }
}
