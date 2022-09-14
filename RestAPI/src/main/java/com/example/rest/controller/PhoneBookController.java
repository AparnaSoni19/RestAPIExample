package com.example.rest.controller;

import com.example.rest.model.PhoneBook;
import com.example.rest.repository.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.*;

@RestController
public class PhoneBookController {

    @Autowired
    PhoneBookRepository phoneBookRepository;

    @PostMapping("/addPhoneBook")
    public String savePhoneBook(@RequestBody PhoneBook phoneBook)
    {
         phoneBookRepository.save(phoneBook);
        return "It is Saved";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        phoneBookRepository.deleteById(id);

        return "Deleted Successfully";
    }

    @GetMapping("/getPhoneBook/{phone}")
    public PhoneBook getName(@PathVariable String phone)
    {
        return phoneBookRepository.findByPhone(phone);
    }


}
