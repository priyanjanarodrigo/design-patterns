package com.myorg.pp.implementation;

import com.myorg.pp.implementation.concretePrototype.Car;
import com.myorg.pp.implementation.concretePrototype.MotorBicycle;
import com.myorg.pp.implementation.prototypeCache.VehicleCache;

public class PrototypePatternDemo {

  /**
   * Java main method.
   *
   * @param args String array arguments.
   */
  public static void main(String[] args) {
    System.out.println("Creating and loading the objects in the cache...");
    VehicleCache vehicleCache = new VehicleCache();
    vehicleCache.loadCache();

    double startTime = System.currentTimeMillis();
    double endTime;

    System.out.println("\nCloning the objects from the cache...");

    MotorBicycle yamahaR1Clone = (MotorBicycle) vehicleCache.getVehicle("yamahaR1");
    endTime = System.currentTimeMillis();
    System.out.println(
        "\nMotorBicycle object cloning completed in : " + (endTime - startTime) + " milliseconds");
    System.out.println(yamahaR1Clone);

    startTime = System.currentTimeMillis();
    Car nissanGTRClone = (Car) vehicleCache.getVehicle("nissanGTR");
    endTime = System.currentTimeMillis();
    System.out.println(
        "\nCar object cloning completed in : " + (endTime - startTime) + " milliseconds");
    System.out.println(nissanGTRClone);
  }
}
