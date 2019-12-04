package com.bilist;

public class Car extends Vehicle {

    public Car() {
        this.setDistance(100);
        this.setVehicleRange(10);
        this.setVehicleType("Car");
        this.setAgeLimit(18);
        System.out.println("Car created. 100 miles to go!");
    }
}
