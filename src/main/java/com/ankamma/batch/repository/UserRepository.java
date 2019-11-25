package com.ankamma.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankamma.batch.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}