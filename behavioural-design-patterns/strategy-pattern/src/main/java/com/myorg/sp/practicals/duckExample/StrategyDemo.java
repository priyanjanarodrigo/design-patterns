package com.myorg.sp.practicals.duckExample;

import com.myorg.sp.practicals.duckExample.behaviourStrategyImpl.FullHdDisplay;
import com.myorg.sp.practicals.duckExample.behaviourStrategyImpl.JetFly;
import com.myorg.sp.practicals.duckExample.behaviourStrategyImpl.NoFly;
import com.myorg.sp.practicals.duckExample.behaviourStrategyImpl.NoQuack;
import com.myorg.sp.practicals.duckExample.behaviourStrategyImpl.SimpleDisplay;
import com.myorg.sp.practicals.duckExample.behaviourStrategyImpl.SimpleFly;
import com.myorg.sp.practicals.duckExample.behaviourStrategyImpl.SimpleQuack;

public class StrategyDemo {
  public static void main(String[] args) {
    RubberDuck rubberDuck = new RubberDuck(new NoQuack(), new SimpleDisplay(), new NoFly());
    System.out.println("Rubber Duck -----------------");
    rubberDuck.executeBehaviour();

    RobotDuck robotDuck = new RobotDuck(new SimpleQuack(), new FullHdDisplay(), new JetFly());
    System.out.println("Robot Duck ------------------");
    robotDuck.executeBehaviour();

    NaturalDuck naturalDuck = new NaturalDuck(new SimpleQuack(), new SimpleDisplay(), new SimpleFly());
    System.out.println("Natural Duck -----------------");
    naturalDuck.executeBehaviour();
  }
}
