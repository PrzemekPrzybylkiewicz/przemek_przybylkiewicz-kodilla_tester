package com.kodilla.inheritance.homework;

public class Winxp extends OperatingSystem {
    private int yearOs = 2005;

    public Winxp(int yearOs) {
        super(yearOs);
    }

    public void turnOn() {
        System.out.println("Computer whit XP ");
    }

    public void turnOff() {
        System.out.println("Computer whit XP ");
    }

    public void whichYear() {
        System.out.println("Year of prod." + yearOs);
    }
}
