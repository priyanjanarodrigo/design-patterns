package com.myorg.pp.implementation.concretePrototype;

import com.myorg.pp.implementation.prototype.Prototype;

/**
 * MotorBicycle class extends Vehicle class, and it is a Concrete Prototype which implements the
 * Prototype interface.
 */
public class MotorBicycle extends Vehicle {

  private String handleType;

  public String getHandleType() {
    return handleType;
  }

  public void setHandleType(String handleType) {
    this.handleType = handleType;
  }

  /**
   * Loads wiring diagram data. Assume that loading the wiring diagram is expensive and
   * time-consuming.
   */
  @Override
  public void loadWiringDiagram() {
    try {
      // Assume that loading the wiring diagram data is costly as it is time-consuming.
      Thread.sleep(5000);
      this.setWiringDiagramData("MotorBicycle Wiring Diagram Data Sample");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public MotorBicycle(String make, String model, String color, String handleType) {
    super(make, model, color);
    this.handleType = handleType;
  }

  private MotorBicycle(MotorBicycle motorBicycle) {
    super(motorBicycle);
    this.handleType = motorBicycle.handleType;
  }

  @Override
  public Prototype clone() {
    return new MotorBicycle(this);
  }


  @Override
  public String toString() {
    return "MotorBicycle{" + "make='" + getMake() + '\'' + ", model='" + getModel() + '\''
        + ", color='" + getColor() + '\'' + ", handleType='" + handleType + '\'' + '}';
  }
}
