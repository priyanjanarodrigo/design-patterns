package com.myorg.pp.implementation.concretePrototype;

import com.myorg.pp.implementation.prototype.Prototype;

/**
 * Car class extends Vehicle class, and it is a Concrete Prototype which implements the Prototype
 * interface.
 */
public class Car extends Vehicle {

  private int numberOfDoors;

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  /**
   * Loads wiring diagram data. Assume that loading the wiring diagram is expensive and
   * time-consuming.
   */
  @Override
  public void loadWiringDiagram() {
    try {
      // Assume that loading the wiring diagram data is costly as it is time-consuming.
      Thread.sleep(3000);
      this.setWiringDiagramData("Car Wiring Diagram Data Sample");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  public Car(String make, String model, String color, int numberOfDoors) {
    super(make, model, color);
    this.numberOfDoors = numberOfDoors;
  }

  private Car(Car car) {
    super(car);
    this.numberOfDoors = car.numberOfDoors;
  }

  /**
   * This method is responsible for cloning the object/returning a copy of the object.
   *
   * @return Car
   */
  @Override
  public Prototype clone() {
    return new Car(this);
  }

  @Override
  public String toString() {
    return "Car{" + "make='" + getMake() + '\'' + ", model='" + getModel() + '\''
        + ", color='" + getColor() + '\'' + ", numberOfDoors='" + numberOfDoors + '\'' + '}';
  }
}
