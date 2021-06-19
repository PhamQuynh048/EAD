package com.pham_thi_ngoc_quynh.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "book_name")
    private  String book_name;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @ManyToOne
    @JoinColumn(name = "publishers", insertable = false, updatable = false)
    private PublisherEntity publishers;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public PublisherEntity getPublishers() {
        return publishers;
    }

    public void setPublishers(PublisherEntity publishers) {
        this.publishers = publishers;
    }

    public BookEntity(int ID, String book_name, String author, String genre) {
        this.ID = ID;
        this.book_name = book_name;
        this.author = author;
        this.genre = genre;

    }
    public  BookEntity(){}
    public  BookEntity(String book_name, String author, String genre){
        this.book_name = book_name;
        this.author = author;
        this.genre = genre;

    }
}
