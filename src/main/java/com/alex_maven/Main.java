package com.alex_maven;

import com.alex_maven.model.Book;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Book> books = initBooks();

        Collections.sort(books);

        for (var s : books) {
            System.out.println(s);
        }


    }

    private static List<Book> initBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book.BookBuilder().setBook("Book5").setAuthor("AuthorX").setPages(22).build());
        books.add(new Book.BookBuilder().setBook("Book4").setAuthor("AuthorY").setPages(12).build());
        books.add(new Book.BookBuilder().setBook("Book3").setAuthor("AuthorG").setPages(16).build());
        books.add(new Book.BookBuilder().setBook("Book2").setAuthor("AuthorH").setPages(13).build());
        books.add(new Book.BookBuilder().setBook("Book1").setAuthor("AuthorZ").setPages(19).build());


        return books;
    }
}