package com.bookapi.book.Models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Data
@ToString
@Getter
@Setter
@Document(collection = "user")
public class User {
    @Id
    String uid;
    String name;
    String email;
    String password;
}

