package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@Data
@Builder
@Generated
public class User {
    private int userId;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;
    private Date createdOn;
    private Role role = Role.USER;
    private AccountStatus status = AccountStatus.UNAPPROVED;

}
