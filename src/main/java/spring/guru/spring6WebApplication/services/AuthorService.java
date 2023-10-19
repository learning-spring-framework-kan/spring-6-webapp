package spring.guru.spring6WebApplication.services;

import spring.guru.spring6WebApplication.domain.Author;

public interface AuthorService {

    Iterable<Author> getAuthors();
}
