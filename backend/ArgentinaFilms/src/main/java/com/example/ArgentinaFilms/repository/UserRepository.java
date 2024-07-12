package com.example.ArgentinaFilms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ArgentinaFilms.entity.User;

public interface  UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
