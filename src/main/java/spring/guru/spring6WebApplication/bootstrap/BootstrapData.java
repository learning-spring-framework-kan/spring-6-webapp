package spring.guru.spring6WebApplication.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.guru.spring6WebApplication.domain.Author;
import spring.guru.spring6WebApplication.domain.Book;
import spring.guru.spring6WebApplication.domain.Publisher;
import spring.guru.spring6WebApplication.repositories.AuthorRepository;
import spring.guru.spring6WebApplication.repositories.BookRepository;
import spring.guru.spring6WebApplication.repositories.PublisherRepository;

import java.util.HashSet;
import java.util.Set;

@Component
public class BootstrapData implements CommandLineRunner {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;

    public BootstrapData(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher pearson = new Publisher();
        pearson.setPublisherName("Pearsons Limited");
        Publisher pearsonSaved = publisherRepository.save(pearson);

        Author kanwar = new Author();
        kanwar.setFirstName("Kanwarpal");
        kanwar.setLastName("Singh");
        Set<Author> authorSet = new HashSet<>();
        authorSet.add(kanwar);


        Book meraPind = new Book();
        meraPind.setIsbn("1234");
        meraPind.setTitle("M_E_R_A_P_I_N_D");
        meraPind.setPublisher(pearson);
        meraPind.setAuthors(authorSet);

        Book meraShehr = new Book();
        meraShehr.setIsbn("4567");
        meraShehr.setTitle("M_E_R_A_S_H_E_H_R");
        meraShehr.setPublisher(pearson);
        meraShehr.setAuthors(authorSet);

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(meraPind);
        bookSet.add(meraShehr);

        pearsonSaved.setBooks(bookSet);

        Author kanwarSaved = authorRepository.save(kanwar);
        Book meraPindSaved = bookRepository.save(meraPind);
        Book meraShehrSaved = bookRepository.save(meraShehr);
        Publisher pearsonSaved2 = publisherRepository.save(pearsonSaved);



        System.out.println("Inside BootstrapData...");
        System.out.println("Count Authors: "+ authorRepository.count());
        System.out.println("Count Book: "+bookRepository.count());
        System.out.println("Count Publishers: "+ publisherRepository.count());
        System.out.println(pearsonSaved.toString());

    }
}
