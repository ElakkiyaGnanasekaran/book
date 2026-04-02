package com.example.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.book.Model.Book;
import com.example.book.service.BookService;

@RestController
@RequestMapping("/books")

public class BookController {
        @Autowired
        private BookService service;

        // Add Book
        @PostMapping
        public Book addBook(@RequestBody Book book) {
            return service.addBook(book);
        }

        // Get All Books
        @GetMapping
        public List<Book> getAllBooks() {
            return service.getAllBooks();
        }

        // Get Book by ID
        @GetMapping("/{id}")
        public Book getBook(@PathVariable Long id) {
            return service.getBookById(id);
        }

        // Update Book
        @PutMapping("/{id}")
        public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
            return service.updateBook(id, book);
        }

        // Delete Book
        @DeleteMapping("/{id}")
        public String deleteBook(@PathVariable Long id) {
            service.deleteBook(id);
            return "Book deleted successfully";
        }
    }
