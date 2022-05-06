package com.myorg.bp.implementation;

public class CarBuilderDemo {
    /**
     * Why we need Builder Pattern :
     * =============================
     *
     * Sometimes we need to use multiple constructors in order to create an object.
     * It may not be the same set of property values which are required to initialize/ build that object all the time.
     * There can be many combinations of properties associated with object creation
     *
     * -----------------------------------------------------------------------------------------------------------------
     * Ex: consider following Car class and imagine that a Car is rented out with following facilities
     *
     * class Car {
     *      String insurance
     *      Boolean roadAssistance
     *      String highWayPass
     * }
     *
     * Every customer who is buying a car for rent may not need all the facilities. Consider following scenarios
     * and required constructors for Car object initialization
     *
     * 1. Customer A needs only insurance and highWayPass.
     *      public Car(String insurance, String highWayPass)
     *
     * 2. Customer B needs roadAssistance enabled and highWayPass
     *      public Car(Boolean roadAssistance, String highWayPass)
     *
     * 3. Customer C needs only the highWayPass
     *      public Car(String highWayPass)
     *
     * 4. Customer D needs nothing (just the Car)r
     *      public Car()
     *
     * 5. Customer E needs all the facilities
     *      public Car(String insurance,Boolean roadAssistance, String highWayPass)
     *
     * Therefore, as a summary, considering the different scenarios above, we need following 5 constructors.
     *
     *      public Car()
     *      public Car(String highWayPass)
     *      public Car(Boolean roadAssistance, String highWayPass)
     *      public Car(String insurance, String highWayPass)
     *      public Car(String insurance,Boolean roadAssistance, String highWayPass)
     *-----------------------------------------------------------------------------------------------------------------
     *
     * This traditional way of implementation can cause more complexity of code when it comes to the implementation.
     *
     * As a solution for this, some developers use/used a telescopic constructor.
     *
     * A "Telescopic Constructor" means that we can have multiple constructors, and each constructor use other
     * constructors depending on the parameters provided.
     * (Implementation -  refer CarTelescopic1, CarTelescopic2 and TelescopicDemo classes available in
     * com.myorg.bp.telescopic package)
     *
     * Some developers use "Setters" to set the object state. But the real problem with setters is that we cannot make
     * it immutable, because anyone can change the object state after creation.That's not a good practise to introduce
     * in some cases.
     *
     * One disadvantages of the builder pattern is that we need to do a lot of coding initially depending on the
     * number of properties available. But once it's done, it'll be really easy to use
     *
     * Java StringBuilder is a good example for builder pattern usage
     *
     * So those are the problems that we are going to solve with Builder Pattern. Refer the Car class available in the
     * same package for implementation.
     * */

    public static void main(String[] args) {
        // builder initialization with mandatory parameter "insurance"
        Car.Builder carBuilder = new Car.Builder("Full");

        Car car = carBuilder
            .dropOffLocation("California")
            .roadAssistance("GPS")
            .build();

        System.out.println(car);
    }
}
