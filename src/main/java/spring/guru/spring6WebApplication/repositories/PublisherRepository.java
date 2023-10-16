package spring.guru.spring6WebApplication.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.guru.spring6WebApplication.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}