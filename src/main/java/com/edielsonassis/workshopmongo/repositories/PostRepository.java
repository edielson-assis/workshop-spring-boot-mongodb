package com.edielsonassis.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;

import com.edielsonassis.workshopmongo.domain.Post;

@Controller
public interface PostRepository extends MongoRepository<Post, String> {  
}