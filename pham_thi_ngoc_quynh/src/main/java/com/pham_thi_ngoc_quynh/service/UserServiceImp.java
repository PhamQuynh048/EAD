package com.pham_thi_ngoc_quynh.service;

import com.pham_thi_ngoc_quynh.entity.BookEntity;
import com.pham_thi_ngoc_quynh.entity.PublisherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp  implements UserService{
    @Autowired
    UserRepo userRepo;
    @Autowired
    PublisherRepo publisherRepo;

    @Override
    public List<BookEntity> getAll() {
        return userRepo.findAll();
    }

    @Override
    public List<PublisherEntity> getAllPublisher() {
        return publisherRepo.findAll();
    }

    @Override
    public BookEntity createUser(BookEntity p) {
        return userRepo.save(p);
    }


//    @Override
//    public Optional<BookEntity> findUserById(int id) {
//        return userRepo.findById(id);
//    }
//

    @Override
    public Page<BookEntity> findAll(Pageable pageable) {
        return userRepo.findAll(pageable);
    }

//    @Override
//    public Page<BookEntity> findAllByFirstNameContaining(String firstname, Pageable pageable) {
//        return userRepo.findAllByNameContaining(firstname, pageable);

}
