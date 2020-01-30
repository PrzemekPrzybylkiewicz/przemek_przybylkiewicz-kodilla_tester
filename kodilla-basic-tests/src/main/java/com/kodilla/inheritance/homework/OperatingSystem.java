package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOs;
    OperatingSystem(int yearOs){
        this.yearOs=yearOs;
    }

    public void turnOn(){
        System.out.println("Computer is " + yearOs);
    }
    public void turnOff(){
        System.out.println("Computer is " + yearOs);
    }
    public int getYearOs() {
        return yearOs;
    }
    public void whichYear(){
        System.out.println("Year of prod."+ yearOs);
    }

}
