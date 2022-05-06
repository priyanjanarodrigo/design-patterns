package com.myorg.sp.practicals.duck.behaviourStrategyImpl;

import com.myorg.sp.practicals.duck.behaviourStrategy.IDisplayBehaviour;

public class FullHdDisplay implements IDisplayBehaviour {
  @Override
  public void display() {
    System.out.println("Full HD Display");
  }
}
