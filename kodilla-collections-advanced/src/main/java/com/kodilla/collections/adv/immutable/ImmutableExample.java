package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
       Book book= new BookHacked("John Banks", "The last Xmasss");
       BookHacked bookHacked = (BookHacked) book;
      bookHacked.modifyTitle("new title");
        System.out.println(book.getTitle());

    }
}

