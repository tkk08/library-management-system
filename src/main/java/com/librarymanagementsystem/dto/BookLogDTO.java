package com.librarymanagementsystem.dto;

import com.librarymanagementsystem.annotations.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Generated
public class BookLogDTO {
    int id;
    String name;
    String author;
    String bookOrderedOn;
    String bookValidUntil;
    String bookSubmissionDate;
}
