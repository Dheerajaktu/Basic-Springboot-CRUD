package com.api.book.bootrestbook.entity;

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private boolean bookAvailibility;

    public Book(int bookId, String bookName, String bookAuthor, boolean bookAvailibility) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookAvailibility = bookAvailibility;
    }

    public Book() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public boolean isBookAvailibility() {
        return bookAvailibility;
    }

    public void setBookAvailibility(boolean bookAvailibility) {
        this.bookAvailibility = bookAvailibility;
    }

    @Override
    public String toString() {
        return "Book [bookAuthor=" + bookAuthor + ", bookAvailibility=" + bookAvailibility + ", bookId=" + bookId
                + ", bookName=" + bookName + "]";
    }

}
