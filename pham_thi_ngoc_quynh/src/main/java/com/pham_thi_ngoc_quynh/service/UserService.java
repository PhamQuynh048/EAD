package com.pham_thi_ngoc_quynh.service;

import com.pham_thi_ngoc_quynh.entity.BookEntity;
import com.pham_thi_ngoc_quynh.entity.PublisherEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<BookEntity> getAll();
    List<PublisherEntity> getAllPublisher();

    BookEntity createUser(BookEntity p);


    Page<BookEntity> findAll(Pageable pageable);
}
