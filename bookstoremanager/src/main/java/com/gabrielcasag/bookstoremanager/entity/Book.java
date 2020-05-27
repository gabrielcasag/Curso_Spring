package com.gabrielcasag.bookstoremanager.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false , unique = true)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "publisher_name" , nullable = false , unique = true)
    private String publisherName;

    @ManyToOne(fetch = FetchType.LAZY , cascade = {CascadeType.PERSIST , CascadeType.MERGE , CascadeType.REMOVE})
    @JoinColumn(name= "author_id")
    private Author author;

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    public Integer getChapters() {
        return chapters;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public void setChapters(Integer chapters) {
        this.chapters = chapters;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
