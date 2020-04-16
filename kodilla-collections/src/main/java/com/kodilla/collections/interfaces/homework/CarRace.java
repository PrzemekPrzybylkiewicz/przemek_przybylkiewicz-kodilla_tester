package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(150);
        Opel opel = new Opel(100);
        Volvo volvo = new Volvo(30);
        doRace(ford);
        doRace(opel);
        doRace(volvo);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed() + " km na godzinę ");
    }
}
