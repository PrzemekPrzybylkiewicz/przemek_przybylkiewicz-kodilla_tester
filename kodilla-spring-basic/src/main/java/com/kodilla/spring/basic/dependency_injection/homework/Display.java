package com.kodilla.spring.basic.dependency_injection.homework;


import org.springframework.stereotype.Component;

@Component
public class Display {
    double a;
    double b;

    public void display (double value){
        if (value == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (value == '-') {
            System.out.println(a + " - " + b+ " = " + (a - b));
        } else if (value == '*') {
            System.out.println(a + " x " + b + " = " + (a * b));
        } else if (value == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else {
            System.out.println("Invalid Operator");
        }

    }
}
