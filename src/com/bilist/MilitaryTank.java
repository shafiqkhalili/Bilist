package com.bilist;

public class MilitaryTank extends Vehicle {
    public MilitaryTank() {
        this.setDistance(2000);
        this.setVehicleRange(5);
        this.setVehicleType("Tank");
        this.setAgeLimit(25);
        System.out.println("Tank created. 2000 miles to go!");
    }

}
