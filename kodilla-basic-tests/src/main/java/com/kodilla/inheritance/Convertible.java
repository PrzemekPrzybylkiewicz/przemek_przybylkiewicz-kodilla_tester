package com.kodilla.inheritance;

public class Convertible extends Car {
    public Convertible(int wheels,int seats){
        super(wheels, seats);
        System.out.println("Convertible constructor");
    }
    public void openRoof(){
        System.out.println("Open roof top.");
    }
    public void closeRoof(){
        System.out.println("Close roof top.");
    }

    public void openDoor(){
        System.out.println("Opening 2 doors");
    }
}
