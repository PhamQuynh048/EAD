package com.pham_thi_ngoc_quynh.service;

import com.pham_thi_ngoc_quynh.entity.PublisherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<PublisherEntity,Integer> {
}
