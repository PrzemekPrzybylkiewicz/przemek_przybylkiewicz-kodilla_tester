package com.kodilla.abstracts.homework;

public class Programista extends Job {

    public Programista() {
        super(10000,"Wytwarzanie Aplikacji");
    }

    @Override
    public void toDo() {
        System.out.println("Programista ma za zadanie " +getResponsibilities());
        System.out.println("Wynagrodzenie "+getSalary());
    }
}
