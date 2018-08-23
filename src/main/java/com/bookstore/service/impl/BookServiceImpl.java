package com.bookstore.service.impl;

import com.bookstore.domain.Book;

import com.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }


    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}
