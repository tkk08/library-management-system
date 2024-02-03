package com.librarymanagementsystem.controller;

import com.librarymanagementsystem.dto.BookLogDTO;
import com.librarymanagementsystem.model.Book;
import com.librarymanagementsystem.service.BookService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
class LibraryControllerTest {
    @Mock
    BookService bookService;
    @InjectMocks
    LibraryController libraryController;


    @Test
    void getBooksTest() {
        List<Book> bookList = new ArrayList<>(){{
            add(Book.builder().build());
        }};
        when(bookService.getBooks()).thenReturn(bookList);
        Assertions.assertThat(libraryController.getBooks().get(0)).isNotNull().isInstanceOf(Book.class);
    }

    @Test
    void getBooksRegisteredByUserTest() {
        List<BookLogDTO> bookLogList = new ArrayList<>(){{
            add(BookLogDTO.builder().build());
        }};
        when(bookService.getBooksInUseByUser(1)).thenReturn(bookLogList);
        Assertions.assertThat(libraryController.getBooksRegisteredByUser(1).get(0)).isNotNull().isInstanceOf(BookLogDTO.class);

    }
}
