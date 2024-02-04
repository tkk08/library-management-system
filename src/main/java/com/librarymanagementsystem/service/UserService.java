package com.librarymanagementsystem.service;

import com.librarymanagementsystem.database.AppData;
import com.librarymanagementsystem.model.UserAccount;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserAccount getUserInfo(int userId){
        return AppData.getUserData().get(userId);
    }
}
