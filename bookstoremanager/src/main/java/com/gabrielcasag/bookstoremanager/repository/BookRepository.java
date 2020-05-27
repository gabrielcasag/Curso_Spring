package com.gabrielcasag.bookstoremanager.repository;

import com.gabrielcasag.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
