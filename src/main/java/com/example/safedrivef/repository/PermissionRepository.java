package com.example.safedrivef.repository;

import com.example.safedrivef.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PermissionRepository extends JpaRepository<Permission, Long> {

    Permission findByName(String name);

}
