package com.example.rest.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document("PhoneBook")
@NoArgsConstructor
@AllArgsConstructor
public class PhoneBook {
    @Id
    int id;
    String name;
    String phone;
}

