package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Generated
public class Book {
    private int id;
    private String name;
    private String author;
    private float price;
    private boolean ordered;
    public int bookCategoryId;
}
