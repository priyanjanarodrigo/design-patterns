package com.myorg.sp.practicals.duck.behaviourStrategyImpl;

import com.myorg.sp.practicals.duck.behaviourStrategy.IQuackBehaviour;

public class SimpleQuack implements IQuackBehaviour {
  @Override
  public void quack() {
    System.out.println("Simple Quack ...!");
  }
}
