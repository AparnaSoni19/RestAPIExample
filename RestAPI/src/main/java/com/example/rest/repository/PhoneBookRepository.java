package com.example.rest.repository;

import com.example.rest.model.PhoneBook;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepository extends MongoRepository<PhoneBook,Integer> {
    PhoneBook findByPhone(String phone);
}
