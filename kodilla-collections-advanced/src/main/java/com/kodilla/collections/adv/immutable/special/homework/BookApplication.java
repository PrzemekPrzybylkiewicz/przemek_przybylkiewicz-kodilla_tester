package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {

       BookManager bookManager = new BookManager("v","b");
      // bookManager.createBook("Book","Author");

       System.out.println(bookManager.getAuthor()+""+bookManager.getTitle());

    }
}
