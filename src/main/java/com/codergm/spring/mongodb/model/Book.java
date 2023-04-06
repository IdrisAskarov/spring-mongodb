package com.codergm.spring.mongodb.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
//@Document(collation = "Book")
@Document
public class Book {
    @Id
    private int id;
    private String bookName;
    private String authorName;
}
