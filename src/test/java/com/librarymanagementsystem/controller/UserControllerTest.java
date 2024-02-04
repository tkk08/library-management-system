package com.librarymanagementsystem.controller;

import com.librarymanagementsystem.model.UserAccount;
import com.librarymanagementsystem.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest
class UserControllerTest {
    @Mock
    UserService userService;

    @InjectMocks
    UserController userController;

    @Test
    void getUserInfoTest(){
        when(userService.getUserInfo(1)).thenReturn(UserAccount.builder().build());
        assertThat(userController.getUserInfo(1)).isNotNull().isExactlyInstanceOf(UserAccount.class);
    }
}
