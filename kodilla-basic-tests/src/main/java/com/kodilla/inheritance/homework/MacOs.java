package com.kodilla.inheritance.homework;

public class MacOs extends OperatingSystem {
    MacOs(int yearOs) {
        super(yearOs);
    }

    public void turnOn() {
        System.out.println("Computer whit MaxOs ");
    }

    public void turnOff() {
        System.out.println("Computer whit MaxOs");
    }
}
