package com.gabrielcasag.bookstoremanager.controller;

import com.gabrielcasag.bookstoremanager.dto.MessageResponseDTO;
import com.gabrielcasag.bookstoremanager.entity.Book;
import com.gabrielcasag.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")
public class  BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book) {
        Book savedBook = bookRepository.save(book);

        MessageResponseDTO message = new MessageResponseDTO();
        message.setMessage("Book created with ID:"+savedBook.getId());

        return message;
    }
}
