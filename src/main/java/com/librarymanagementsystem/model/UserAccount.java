package com.librarymanagementsystem.model;

import com.librarymanagementsystem.annotations.Generated;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@Generated
@Entity
@Table(name ="user_account")
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String password;
    private Date createdOn;
    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;
    @Enumerated(EnumType.STRING)
    private AccountStatus status = AccountStatus.UNAPPROVED;
}
