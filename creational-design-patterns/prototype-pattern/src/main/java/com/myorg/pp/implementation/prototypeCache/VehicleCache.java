package com.myorg.pp.implementation.prototypeCache;

import com.myorg.pp.implementation.concretePrototype.Car;
import com.myorg.pp.implementation.concretePrototype.MotorBicycle;
import com.myorg.pp.implementation.concretePrototype.Vehicle;
import java.util.HashMap;
import java.util.Map;

/**
 * This is the prototype registry/cache.
 */
public class VehicleCache {

  private Map<String, Vehicle> vehicleCache = new HashMap<>();

  /**
   * Loads the vehicleCache map with sample Vehicle objects.
   */
  public void loadCache() {
    double startTime = System.currentTimeMillis();
    double endTime;

    Car nissanGTR = new Car("Nissan", "GTR", "Black", 2);
    nissanGTR.loadWiringDiagram();

    endTime = System.currentTimeMillis();
    System.out.println(
        "\nCar object creation completed in : " + (endTime - startTime) + " milliseconds");

    System.out.println(nissanGTR);
    vehicleCache.put("nissanGTR", nissanGTR); // Registering the object in the cache

    startTime = System.currentTimeMillis();

    MotorBicycle yamahaR1 = new MotorBicycle("Yamaha", "R1", "Red", "Butterfly Handle");
    yamahaR1.loadWiringDiagram();

    endTime = System.currentTimeMillis();
    System.out.println(
        "\nMotorBicycle object creation completed in : " + (endTime - startTime) + " milliseconds");

    System.out.println(yamahaR1);
    vehicleCache.put("yamahaR1", yamahaR1); // Registering the object in the cache
  }

  /**
   * Returns the Vehicle clone which is related to the specified reference id via the argument.
   *
   * @param name Vehicle name.
   * @return Vehicle.
   */
  public Vehicle getVehicle(String name) {
    return (Vehicle) vehicleCache.get(name).clone();
  }
}
