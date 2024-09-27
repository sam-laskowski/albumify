package com.albumify.musicapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.albumify.musicapp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    Optional<User> findByVerificationCode(String code);
    Optional<User> findByEmail(String email);

}
