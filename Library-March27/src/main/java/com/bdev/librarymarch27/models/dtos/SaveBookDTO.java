package com.bdev.librarymarch27.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SaveBookDTO {
    private String isbn;
    private String title;
    private String owner;
}
