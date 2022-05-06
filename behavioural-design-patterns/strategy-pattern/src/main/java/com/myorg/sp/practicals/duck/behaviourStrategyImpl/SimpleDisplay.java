package com.myorg.sp.practicals.duck.behaviourStrategyImpl;

import com.myorg.sp.practicals.duck.behaviourStrategy.IDisplayBehaviour;

public class SimpleDisplay implements IDisplayBehaviour {
  @Override
  public void display() {
    System.out.println("Simple Display ...!");
  }
}
