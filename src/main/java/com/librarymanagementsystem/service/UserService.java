package com.librarymanagementsystem.service;

import com.librarymanagementsystem.database.AppData;
import com.librarymanagementsystem.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUserInfo(int userId){
        return AppData.getUserData().get(userId);
    }
}
