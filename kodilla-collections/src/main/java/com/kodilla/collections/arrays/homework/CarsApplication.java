package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
    Random x = new Random();
    int y= x.nextInt(16)+1;
    Car[] cars = new Car[y];
        for (int i = 0; i <cars.length ; i++) {
            cars[i]= drawCar();
            for (Car cary:cars)
            CarUtils.describeCar(cary);
        }
    }
    public static Car drawCar(){
        Random r = new Random();
        int drawModels = r.nextInt(3);
        int x = r.nextInt(60);
        System.out.println(x);
        System.out.println(drawModels);
        if(drawModels==0){
            return new Volvo(x);
        } else if (drawModels==1) {
            return new Ford(x);
        }else
            return new Opel(x);
    }
}
