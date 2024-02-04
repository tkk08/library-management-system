package com.librarymanagementsystem.controller;

import com.librarymanagementsystem.model.UserAccount;
import com.librarymanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserController {
    @Autowired
    UserService userService;
    /**
     * Get information about the User
     * @return User Details
     */
    @GetMapping(path = "/users/{userId}")
    public UserAccount getUserInfo(@PathVariable int userId){
        return userService.getUserInfo(userId);
    }
}
