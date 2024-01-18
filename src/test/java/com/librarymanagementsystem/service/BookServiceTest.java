package com.librarymanagementsystem.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class BookServiceTest {
    @InjectMocks
    BookService bookService;

    @Test
    void getBooksTest(){
        assertThat(bookService.getBooks()).isNotNull().hasSize(5);
    }

    @Test
    void getBooksInUseByUserTest(){
        assertThat(bookService.getBooksInUseByUser(1)).isNotNull().hasSize(3);
    }
}
