package com.api.book.bootrestbook.controller;

import java.util.List;

import com.api.book.bootrestbook.entity.Book;
import com.api.book.bootrestbook.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return this.bookService.getBookById(id);

    }

}
