package com.example.coursenelioa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coursenelioa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
