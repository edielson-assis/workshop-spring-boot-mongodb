package com.edielsonassis.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;

import com.edielsonassis.workshopmongo.domain.User;

@Controller
public interface UserRepository extends MongoRepository<User, String> {
}