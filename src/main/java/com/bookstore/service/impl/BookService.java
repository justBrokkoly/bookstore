package com.bookstore.service.impl;

import com.bookstore.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> findAll();

    Book findById(Long id);
}
