package spring.guru.spring6WebApplication.services;

import org.springframework.stereotype.Service;
import spring.guru.spring6WebApplication.domain.Book;
import spring.guru.spring6WebApplication.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
