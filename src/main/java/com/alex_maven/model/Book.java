package com.alex_maven.model;

import java.util.Comparator;

public class Book implements Comparable<Book> {
    private final String authorName;
    private final String bookName;
    private final int countPages;

    private Book(BookBuilder builder) {
        this.authorName = builder.authorName;
        this.bookName = builder.bookName;
        this.countPages = builder.countPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getCountPages() {
        return countPages;
    }

    @Override
    public int compareTo(Book o) {
        return Comparator.comparingInt(Book::getCountPages)
                .thenComparing(Book::getAuthorName)
                .thenComparing(Book::getCountPages)
                .compare(this, o);
    }

    @Override
    public String toString() {
        return String.format("Книга: %s; Автор: %s; Страницы: %d\n",
                bookName, authorName, countPages);
    }

    public static class BookBuilder {
        private String authorName;
        private String bookName;
        private int countPages;

        public BookBuilder() {
        }

        public BookBuilder setAuthorName(String authorName) {
            this.authorName = authorName;
            return this;
        }

        public BookBuilder setBookName(String bookName) {
            this.bookName = bookName;
            return this;
        }

        public BookBuilder setCountPages(int countPages) {
            this.countPages = countPages;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
