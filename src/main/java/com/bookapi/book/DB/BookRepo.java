package com.bookapi.book.DB;
import com.bookapi.book.Models.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepo extends MongoRepository<Book, String> {    

    
}
