package com.librarymanagementsystem.service;

import com.librarymanagementsystem.model.UserAccount;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserServiceTest {
    @InjectMocks
    UserService userService;

    @Test
    void getUserInfoTest(){
        assertThat(userService.getUserInfo(0)).isNotNull().isExactlyInstanceOf(UserAccount.class);
    }
}
