package com.myorg.bp.telescopic;

import com.myorg.bp.implementation.Car;

public class TelescopicDemo {
    public static void main(String[] args) {
        CarTelescopic1 carTelescopic1 = new CarTelescopic1("full");
        System.out.println(carTelescopic1);

        CarTelescopic2 carTelescopic2 = new CarTelescopic2("null", true);
        System.out.println(carTelescopic2);

        // builder pattern way (we do not need to pass null values explicitly to ignored properties)
        Car.Builder carBuilder = new Car.Builder("Full");

        Car car = carBuilder
                .dropOffLocation("California")
                .roadAssistance("GPS")
                .build();

        System.out.println(car);
    }
}
