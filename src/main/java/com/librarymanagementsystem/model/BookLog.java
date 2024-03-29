package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Generated
public class BookLog {
    int bookId;
    int userId;
    String bookOrderedOn;
    String bookValidUntil;
    String bookSubmissionDate;
    boolean isPenaltySettled;
}
