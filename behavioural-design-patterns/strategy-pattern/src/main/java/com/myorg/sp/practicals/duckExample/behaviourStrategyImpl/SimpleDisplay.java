package com.myorg.sp.practicals.duckExample.behaviourStrategyImpl;

import com.myorg.sp.practicals.duckExample.behaviourStrategy.IDisplayBehaviour;

public class SimpleDisplay implements IDisplayBehaviour {
  @Override
  public void display() {
    System.out.println("Simple Display ...!");
  }
}
