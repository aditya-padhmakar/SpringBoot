package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.model.User;
import com.example.demo.service.BookService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/v1/book")
public class BookController {

    @Autowired
    public BookService bookService;

    @GetMapping("")
    public List<Book> getBooks()
    {
        return this.bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id)
    {
        return this.bookService.getBook(id);
    }

    @PostMapping("")
    public Book addBook(@RequestBody Book b)
    {
        return this.bookService.addBook(b);
    }

    @DeleteMapping("/{id}")
    public Book delBook(@PathVariable int id)
    {
        return this.bookService.deleteBook(id);
    }

}
