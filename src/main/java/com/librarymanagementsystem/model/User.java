package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Generated
public class User {
    private int userId;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;

}
