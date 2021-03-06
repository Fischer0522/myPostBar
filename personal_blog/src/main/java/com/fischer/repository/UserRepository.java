package com.fischer.repository;

import com.fischer.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository {
    void save(User user);

    Optional<User> findById(String id);

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

}
