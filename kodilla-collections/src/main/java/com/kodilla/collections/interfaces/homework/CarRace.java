package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
     Ford ford = new Ford(100,2,3);

    }

    private static void doRace(Car car){
        System.out.println(car.getSpeed());
    }
}
