package com.backsup.nonamemo.repository;

import com.backsup.nonamemo.document.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository  extends MongoRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
