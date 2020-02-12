package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private double speed;
    private int increase;
    private int decrease;

    public Ford(double speed, int increase, int decrease) {
        this.speed = speed;
        this.increase = increase;
        this.decrease = decrease;
    }

    @Override
    public int getSpeed() {
        return increase-decrease;
    }

    @Override
    public void increaseSpeed(){

    }

    @Override
    public void decreaseSpeed() {

    }
}
