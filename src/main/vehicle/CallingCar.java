package main.vehicle;

import java.util.Scanner;

public class CallingCar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Car car;
        boolean airConditioner = false;
        System.out.println("Enter fuel amount in your vehicle");
        float fuelAmount = scanner.nextFloat();
        System.out.println("Enter your vehicles fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();
        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scanner.nextInt();
        System.out.println("Will you turn on air conditioner? y/n");
        String input = scanner.next();
        if(input.toLowerCase().trim().equals("y")) {
            car = new Car(fuelAmount, fuelUsage, passengers, true);
        }else {
            car = new Car(fuelAmount, fuelUsage, passengers, airConditioner);
        }
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers", car.maxDistance());


    }
}
