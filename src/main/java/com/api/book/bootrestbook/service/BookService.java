package com.api.book.bootrestbook.service;

import java.util.ArrayList;
import java.util.List;

import com.api.book.bootrestbook.entity.Book;

import org.springframework.stereotype.Component;

@Component
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(2, "Automata", "Princy Goel", true));
        list.add(new Book(3, "C Progamming Book", "Champu Goel", true));
        list.add(new Book(4, "DAA Book", "Princy Goel", true));
        list.add(new Book(5, "Linear Algebra", "Ricky Sharma", true));
        list.add(new Book(6, "Machine Learning", "Princy Goel", false));
        list.add(new Book(7, "Deep Learning", "Pawan Gangwar", true));
        list.add(new Book(8, "Computer Network", "Princy Goel", true));
        list.add(new Book(9, "Java", "Princy Goel", true));
        list.add(new Book(10, "Mathematics", "Dheeraj Goel", true));
    }

    // get all books
    public List<Book> getAllBooks() {
        return list;
    }

    // get book by ID
    public Book getBookById(int id) {
        Book book = null;
        book = list.stream().filter(e -> e.getBookId() == id).findFirst().get();
        return book;

    }

}
