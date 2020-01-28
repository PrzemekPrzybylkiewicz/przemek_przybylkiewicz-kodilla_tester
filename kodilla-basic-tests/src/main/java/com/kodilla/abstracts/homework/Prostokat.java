package com.kodilla.abstracts.homework;

public class Prostokat extends Shape {
    public Prostokat() {
        super(5,2);
    }

    @Override
    public void givePole() {
        System.out.println("Pole prostokąt "+getA()*getB());
    }

    @Override
    public void giveObwod() {
        System.out.println("Obwod prostokąt "+2*(getA()+getB()));
    }
}
