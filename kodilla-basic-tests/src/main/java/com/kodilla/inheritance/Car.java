package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats) {
        this.wheels = wheels;
        this.seats = seats;
        System.out.println("Car constructor");
    }

    public void turnOnLights() {
        System.out.println("Lights turned on ");
    }

    public void openDoor() {
        System.out.println("Opening 4 doors");

    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }
}
