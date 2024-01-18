package com.librarymanagementsystem.controller;

import com.librarymanagementsystem.model.Book;
import com.librarymanagementsystem.model.BookLog;
import com.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    BookService bookService;

    /**
     * Get list of all book currently available for distribution &
     * display on User Home Page
     * @return List of all books in library
     */
    @GetMapping(path = "/books")
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    /**
     * Get list of books present if any with User
     * @return Book and other information
     */
    @GetMapping(path = "/books/{userId}")
    public List<BookLog> getBooksRegisteredByUser(@PathVariable int userId){
        return bookService.getBooksInUseByUser(userId);
    }

}
