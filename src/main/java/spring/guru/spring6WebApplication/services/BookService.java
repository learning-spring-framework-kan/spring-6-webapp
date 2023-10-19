package spring.guru.spring6WebApplication.services;

import spring.guru.spring6WebApplication.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
