package com.myorg.pp.implementation.concretePrototype;

import com.myorg.pp.implementation.prototype.Prototype;

public abstract class Vehicle implements Prototype {

  protected String make;

  protected String model;

  protected String color;

  protected String wiringDiagramData;

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setWiringDiagramData(String wiringDiagramData) {
    this.wiringDiagramData = wiringDiagramData;
  }

  public String getWiringDiagramData() {
    return wiringDiagramData;
  }

  protected Vehicle(String make, String model, String color) {
    this.make = make;
    this.model = model;
    this.color = color;
  }

  protected Vehicle(Vehicle vehicle) {
    this.make = vehicle.make;
    this.model = vehicle.model;
    this.color = vehicle.color;
  }

  /**
   * Abstract method "clone()" should be implemented by the subclasses. Cloning responsibility is
   * delegated to the subclasses as they contain specialized/specific implementation of their own.
   *
   * @return Vehicle
   */
  public abstract Prototype clone();

  /**
   * Assume that loading the wiring diagram is expensive and time-consuming.
   */
  public abstract void loadWiringDiagram();
}
