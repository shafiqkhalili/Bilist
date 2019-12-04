package com.bilist;

public abstract class Vehicle {

    private static int nrOfVehicles;
    private Driver dr;
    private int distance;
    private int vehicleRange;
    private String vehicleType;
    private int ageLimit;

    public Vehicle(int distance, int vehicleRange, String vehicleType, int ageLimit) {
        this.distance = distance;
        this.vehicleRange = vehicleRange;
        this.vehicleType = vehicleType;
        this.ageLimit = ageLimit;
    }

    public static int getNrOfVehicles() {
        return nrOfVehicles;
    }

    protected void drive() {
        if (this.getDr() == null) {
            System.out.println(this.getVehicleType() + " didn’t drive - there’s no driver!");
        } else {
            this.setDistance(this.getDistance()-this.getVehicleRange());
            System.out.println(this.getVehicleType() + " drove " + this.getVehicleRange() + " miles - " + this.getDistance() + " miles to go");
        }
    }

    protected void setDriver(Driver dr) {
        if (dr.getAge() < this.getAgeLimit()) {
            System.out.println("Driver not changed! " + dr.getName() + " is " + dr.getAge() + ", but must be " + this.getAgeLimit() +
                    " or older to drive " + this.getVehicleType().toLowerCase());
        } else {
            this.setDr(dr);
            System.out.println("Driver changed to " + dr.getName());
        }
    }

    public Driver getDr() {
        return dr;
    }

    public void setDr(Driver dr) {
        this.dr = dr;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getVehicleRange() {
        return vehicleRange;
    }

    public void setVehicleRange(int vehicleRange) {
        this.vehicleRange = vehicleRange;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }
}
