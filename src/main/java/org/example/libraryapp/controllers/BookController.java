package org.example.libraryapp.controllers;

import jakarta.websocket.server.PathParam;
import org.example.libraryapp.dto.BookDTO;
import org.example.libraryapp.models.Book;
import org.example.libraryapp.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookController {
    @Autowired
    BooksService service;

    @PostMapping
    public Book PostBook(@RequestBody BookDTO req){
        return service.PostBookService(req);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> findBookById(@PathVariable long id) {
        return service.findBookById(id);
    }


}
