package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository=new BookRepository();

    public List<Book> getBooks()
    {
        return bookRepository.showall();
    }

    public Book getBook(int id)
    {
        Book u=null;
        for(Book u1: bookRepository.BLIST)
        {
            if(u1.getbId()==id)
            {
                u=u1;
                break;
            }
        }
        return u;
    }

    public Book addBook(Book b)
    {
        bookRepository.save(b);
        return b;
    }

    public Book deleteBook(int id)
    {
        Book u=null;
        for(Book u1: bookRepository.BLIST)
        {
            if(u1.getbId()==id)
                u=u1;
                break;
        }
        bookRepository.delete(u);
        return u;
    }

}
