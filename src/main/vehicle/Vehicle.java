package main.vehicle;

public class Vehicle {

    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers) {
        this.fuel = fuel;
        this.fuelUsage = fuelUsage;
        this.passengers = passengers;
    }

    public float maxDistance(float fuel,float fuelUsage,int passengers){

        float fuelUsageWithPassengers = fuelUsage * 0.05f * passengers;
        float totalFuelUsage = fuelUsage + fuelUsageWithPassengers;

        return (fuel / totalFuelUsage) * 100;
    }
    public float maxDistance(){

        float fuelUsageWithPassengers = fuelUsage * 0.05f * passengers;
        float totalFuelUsage = fuelUsage + fuelUsageWithPassengers;

        return (fuel / totalFuelUsage) * 100;
    }

    public float getFuel() {
        return fuel;
    }

    public float getFuelUsage() {
        return fuelUsage;
    }

    public int getPassengers() {
        return passengers;
    }

}
