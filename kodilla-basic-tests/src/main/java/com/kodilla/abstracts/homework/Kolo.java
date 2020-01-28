package com.kodilla.abstracts.homework;

public class Kolo extends Shape {
    public Kolo() {
        super(4);
    }

    @Override
    public void givePole() {
        System.out.println("Pole koła " + 3.14*(getC()*getC()));
    }

    @Override
    public void giveObwod() {
        System.out.println("Obwód koła "+2*3.14*getC());
    }
}
