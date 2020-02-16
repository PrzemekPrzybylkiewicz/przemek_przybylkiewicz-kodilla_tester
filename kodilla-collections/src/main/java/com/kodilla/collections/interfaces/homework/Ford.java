package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.arrays.homework.CarUtils;

public class Ford implements Car {
    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
    speed = 40 + speed;
    }

    @Override
    public void decreaseSpeed() {
    speed = speed /2-25;
    if(speed <=0){
        speed = 0;
    }
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }
}
