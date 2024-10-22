package com.alex_maven;

import com.alex_maven.model.Book;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Book> books = initBooks();

//        Comparator<Book> authorNameComparator = Comparator.comparing(Book::getAuthorName);
//        Comparator<Book> countPagesComparator = Comparator.comparingInt(Book::getCountPages);
//
//        Arrays.sort(books);

        Collections.sort(books);

        System.out.println(books);
    }

    private static List<Book> initBooks() {
        List<Book> books = new ArrayList<>();

        books.add(new Book.BookBuilder().setAuthorName("AuthorX").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorR").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorY").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorZ").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorH").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorK").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorL").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorM").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorQ").build());
        books.add(new Book.BookBuilder().setAuthorName("AuthorE").build());

        return books;
    }
}