package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Generated
public class BookStock {
    int bookId;
    int totalCopies;
    int freeCopies;
}
