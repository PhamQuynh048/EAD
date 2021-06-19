package com.pham_thi_ngoc_quynh.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "publisher")
public class PublisherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publisher_ID;

    @Column(name = "publisher_name")
    private  String publisher_name;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_person")
    private String contact_person;

    @Column(name = "phone")
    private int phone;

    @OneToMany(mappedBy = "publishers", fetch = FetchType.LAZY)
    private List<BookEntity> book;

    public int getPublisher_ID() {
        return publisher_ID;
    }

    public void setPublisher_ID(int publisher_ID) {
        this.publisher_ID = publisher_ID;
    }

    public String publisher_name() {
        return publisher_name;
    }

    public void setBook_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public List<BookEntity> getBook() {
        return book;
    }

    public void setBook(List<BookEntity> book) {
        this.book = book;
    }
}