package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("Model of a car: " + getModel(car));
        System.out.println("Car speed " + car.getSpeed());
    }
    private static String getModel(Car car) {

    if(car instanceof Volvo)
        return "Volvo";
    else if(car instanceof Opel)
        return "Opel";
    else if(car instanceof Ford)
        return "Ford";
    else
        return "Nie znam tego modelu";
    }
}
