package com.backsup.nonamemo.repository;

import com.backsup.nonamemo.document.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<User, Long> {
}
