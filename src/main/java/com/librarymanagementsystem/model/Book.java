package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@Generated
@Entity
@Table(name= "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private float price;
    private boolean ordered;
    public int bookCategoryId;
}
