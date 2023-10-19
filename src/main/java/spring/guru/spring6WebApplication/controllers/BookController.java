package spring.guru.spring6WebApplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.guru.spring6WebApplication.services.BookService;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String findAll(Model model){
        model.addAttribute("books", bookService.findAll());
        return "books";
    }
}
