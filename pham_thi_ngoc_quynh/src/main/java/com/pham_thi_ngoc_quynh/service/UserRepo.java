package com.pham_thi_ngoc_quynh.service;

import com.pham_thi_ngoc_quynh.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<BookEntity,Integer> {

//    @Query("select p from BookEntity p where p.book_name like %:name%")
//    List<BookEntity> findAllByName(String name, Pageable pageable);
//
//    Page<BookEntity> findAllByNameContaining(String tname, Pageable pageable);
}