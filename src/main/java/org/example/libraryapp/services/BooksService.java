package org.example.libraryapp.services;

import org.example.libraryapp.dto.BookDTO;
import org.example.libraryapp.models.Book;
import org.example.libraryapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksService {
    @Autowired
    private BookRepository repository;

    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    public Optional<Book> findBookById(Long id){
        return repository.findById(id);
    }

    public Book PostBookService(BookDTO data){
        return repository.save(new Book(data));
    }
}
