package com.bdev.librarymarch27.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // at compile time construct setters and getters
@AllArgsConstructor // auto generates the constructor
public class Book {
    private String isbn;
    private String title;


}
