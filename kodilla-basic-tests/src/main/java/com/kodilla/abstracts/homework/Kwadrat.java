package com.kodilla.abstracts.homework;

public class Kwadrat extends Shape {

    public Kwadrat() {
       super(5);
    }

    @Override
    public void givePole() {
        System.out.println("Pole kwadratu to "+getC()*getC());
    }

    @Override
    public void giveObwod() {
        System.out.println("Obwod kwadratu to "+(getC()*4));
    }
}
