package com.example.safedrivef.repository;

import com.example.safedrivef.model.RequestTypeSecond;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface RequestTypeSecondRepository extends JpaRepository<RequestTypeSecond, Long> {
}
