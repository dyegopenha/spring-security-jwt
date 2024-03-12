package com.example.springsecurityjwt.repository;

import java.util.Optional;
import com.example.springsecurityjwt.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}