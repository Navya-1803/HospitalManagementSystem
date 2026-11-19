package com.example.hms.repository;

import com.example.hms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Repository responsible for database operations related to User.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Finds a user using their email address.
     */
    Optional<User> findByEmail(String email);

    /**
     * Checks whether an email address already exists.
     */
    boolean existsByEmail(String email);
}