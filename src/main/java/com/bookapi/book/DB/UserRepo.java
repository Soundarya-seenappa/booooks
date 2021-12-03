package com.bookapi.book.DB;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.bookapi.book.Models.User;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
    
}
