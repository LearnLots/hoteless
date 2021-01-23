package com.robin.hoteless.repository;

import com.robin.hoteless.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // will add items here later as necessary
}