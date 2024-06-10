package main.vehicle;

public class Car extends Vehicle {

    boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    @Override
    public float maxDistance(){
        float distance;
        float fuelUsageWithPassengers = getFuelUsage() * 0.05f * getPassengers();
        float totalFuelUsage = getFuelUsage() + fuelUsageWithPassengers;
        float fuelUsageWithAc = totalFuelUsage + totalFuelUsage * 0.1f;

        if(airConditioner){
            distance = (getFuel() / fuelUsageWithAc) * 100;

        }else {

            distance = (getFuel() / totalFuelUsage) * 100;
        }
        return distance;
    }


}
