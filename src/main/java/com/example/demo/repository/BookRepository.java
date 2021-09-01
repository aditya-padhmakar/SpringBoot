package com.example.demo.repository;

import com.example.demo.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    public static ArrayList<Book> BLIST;

    public BookRepository() {
        BLIST =new ArrayList<>();
        BLIST.add(new Book(1,"B1","B1 book"));
        BLIST.add(new Book(2,"B2","B2 book"));
    }

    public List<Book> showall() {
        return BLIST;
    }

    public void save(Book b) {
        BLIST.add(b);
    }

    public void delete(Book b) {
        BLIST.remove(b);
    }
}
