package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Generated
public class BookCategory {
    private int id;
    private String category;
    private String subCategory;

}
