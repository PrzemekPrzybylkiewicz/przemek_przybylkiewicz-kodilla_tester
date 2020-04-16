package com.kodilla.collections.adv.immutable.special.homework;

import java.util.LinkedList;
import java.util.List;

public class BookManager {

    public Book createBook(String title, String author) {
        List<Book> books = new LinkedList<>();
        books.add(new Book(title, author));
        for (Book book : books) {
            System.out.println(book.getAuthor() + " Autor " + book.getTitle() + " Title");
        }
        return new Book(title, author);
    }


}
