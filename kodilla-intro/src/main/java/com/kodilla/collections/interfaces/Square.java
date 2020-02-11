package com.kodilla.collections.interfaces;

public class Square implements Shape {
    private double widht;

    public Square(double widht) {
        this.widht = widht;
    }
    public double getArea(){
        return widht*widht;
    }
    public double  getPermit(){
        return 4*widht;
    }

    @Override
    public double getPole() {
        return 0;
    }

    @Override
    public double getObowd() {
        return 0;
    }
}
