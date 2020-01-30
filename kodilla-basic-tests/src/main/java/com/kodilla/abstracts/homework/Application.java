package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        kwadrat.giveObwod();
        kwadrat.givePole();
        Kolo kolo = new Kolo();
        kolo.givePole();
        kolo.giveObwod();
        Prostokat prostokat = new Prostokat();
        prostokat.giveObwod();
        prostokat.givePole();

    }
}
