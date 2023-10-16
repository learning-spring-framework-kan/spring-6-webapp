package spring.guru.spring6WebApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.guru.spring6WebApplication.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
