package com.gabrielcasag.bookstoremanager.service;

import com.gabrielcasag.bookstoremanager.dto.BookDTO;
import com.gabrielcasag.bookstoremanager.dto.MessageResponseDTO;
import com.gabrielcasag.bookstoremanager.entity.Book;
import com.gabrielcasag.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(BookDTO bookDTO) {
        Book bookToSave = Book.builder().build();

        Book savedBook = bookRepository.save(bookToSave);

        return MessageResponseDTO.builder()
                .message("Book created with ID:"+savedBook.getId())
                .build();
    }
}
