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
    String startDate;
    String endDate;
    String submissionDate;
    boolean isPenaltySettled;
}
