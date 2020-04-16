package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {

    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.createBook("Mad Max", "Max Maximialianowicz");
        bookManager.createBook("Big Lebowski", "the Dude");
        bookManager.createBook("Pulp Fiction", "Vincet Vega");

        System.out.println(bookManager.equals(bookManager));


    }
}
