package com.kodilla.spring.basic.dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public Calculator (Display display) {
        this.display = display;
    }

    public double add(double a, double b){
        return a+b;
    }
    public double asubtract(double a, double b){
        return a-b;
    }
    public double multiply(double a, double b){
        return a*b;
    }
    public double divide(double a, double b){
        return a/b;
    }
}
