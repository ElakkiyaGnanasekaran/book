package com.example.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book.Model.Book;
import com.example.book.repository.BookRepository;

@Service
public class BookService {

        @Autowired
        private BookRepository repo;

        public Book addBook(Book book) {
            return repo.save(book);
        }
        public List<Book> getAllBooks() {
            return repo.findAll();
        }
        public Book getBookById(Long id) {
            return repo.findById(id).orElse(null);
        }
        public Book updateBook(Long id, Book book) {
            Book existing = repo.findById(id).orElse(null);

            if (existing != null) {
                existing.setName(book.getName());
                existing.setAuthor(book.getAuthor());
                existing.setPrice(book.getPrice());
                return repo.save(existing);
            }

            return null;
        }
        public void deleteBook(Long id) {
            repo.deleteById(id);
        }
    }
