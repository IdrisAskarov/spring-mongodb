package com.codergm.spring.mongodb.repository;

import com.codergm.spring.mongodb.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
