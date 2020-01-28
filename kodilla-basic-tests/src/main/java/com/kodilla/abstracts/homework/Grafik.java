package com.kodilla.abstracts.homework;

public class Grafik extends Job {

    public Grafik(int salary, String responsibilities) {
        super(5000, "Projektowanie");
    }

    @Override
    public void toDo() {
        System.out.println("Grafik komp ma za zadanie " +getResponsibilities());
        System.out.println("Wynagrodzenie "+getSalary());

    }
}
