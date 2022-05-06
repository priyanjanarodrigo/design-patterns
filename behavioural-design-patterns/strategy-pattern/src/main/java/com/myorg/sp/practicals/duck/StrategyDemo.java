package com.myorg.sp.practicals.duck;

import com.myorg.sp.practicals.duck.behaviourStrategyImpl.FullHdDisplay;
import com.myorg.sp.practicals.duck.behaviourStrategyImpl.JetFly;
import com.myorg.sp.practicals.duck.behaviourStrategyImpl.NoFly;
import com.myorg.sp.practicals.duck.behaviourStrategyImpl.NoQuack;
import com.myorg.sp.practicals.duck.behaviourStrategyImpl.SimpleDisplay;
import com.myorg.sp.practicals.duck.behaviourStrategyImpl.SimpleFly;
import com.myorg.sp.practicals.duck.behaviourStrategyImpl.SimpleQuack;

public class StrategyDemo {
  public static void main(String[] args) {
    RubberDuck rubberDuck = new RubberDuck(new NoQuack(), new SimpleDisplay(), new NoFly());
    System.out.println("Rubber Duck -----------------");
    rubberDuck.executeBheviour();

    RobotDuck robotDuck = new RobotDuck(new SimpleQuack(), new FullHdDisplay(), new JetFly());
    System.out.println("Robot Duck ------------------");
    robotDuck.executeBheviour();

    NaturalDuck naturalDuck = new NaturalDuck(new SimpleQuack(), new SimpleDisplay(), new SimpleFly());
    System.out.println("Natural Duck -----------------");
    naturalDuck.executeBheviour();
  }
}
