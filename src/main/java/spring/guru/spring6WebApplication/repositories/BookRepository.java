package spring.guru.spring6WebApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.guru.spring6WebApplication.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
