package spring.guru.spring6WebApplication.services;

import org.springframework.stereotype.Service;
import spring.guru.spring6WebApplication.domain.Author;
import spring.guru.spring6WebApplication.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> getAuthors() {
        return authorRepository.findAll();
    }
}
