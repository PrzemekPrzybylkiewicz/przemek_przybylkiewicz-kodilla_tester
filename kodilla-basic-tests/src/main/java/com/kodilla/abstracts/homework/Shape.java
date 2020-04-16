package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int pole_a;
    private int obwod_b;
    private int kolo_c;


    public Shape(int a, int b) {
        this.pole_a = a;
        this.obwod_b = b;
    }

    public Shape(int c) {
        this.kolo_c = c;

    }

    public int getA() {
        return pole_a;
    }

    public int getB() {
        return obwod_b;
    }

    public int getC() {
        return kolo_c;
    }

    public abstract void givePole();

    public abstract void giveObwod();


}
