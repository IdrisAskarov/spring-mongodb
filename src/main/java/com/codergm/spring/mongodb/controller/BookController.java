package com.codergm.spring.mongodb.controller;

import com.codergm.spring.mongodb.model.Book;
import com.codergm.spring.mongodb.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class BookController {
    private final BookRepository bookRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book) {
        bookRepository.save(book);
        return "Added book with id: " + book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Book getBook(@PathVariable Integer id) {
        return bookRepository.findById(id).get();
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable Integer id) {
        bookRepository.deleteById(id);
        return "Book with id: " + id + " deleted";
    }
}
