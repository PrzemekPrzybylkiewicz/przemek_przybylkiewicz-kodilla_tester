package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Ford;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {

        List<Ford> cars = new ArrayList<>();
        cars.add(new Ford(60));
        cars.add(new Ford(20));
        cars.add(new Ford(55));
        cars.add(new Ford(45));
        cars.add(new Ford(100));

        for (Ford car : cars)
            System.out.println(car.getSpeed());

    }
}


