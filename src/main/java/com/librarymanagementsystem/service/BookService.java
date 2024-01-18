package com.librarymanagementsystem.service;

import com.librarymanagementsystem.database.AppData;
import com.librarymanagementsystem.model.Book;
import com.librarymanagementsystem.model.BookLog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    public List<Book> getBooks(){
        return AppData.getBookData().values().stream().toList();
    }

    public List<BookLog> getBooksInUseByUser(int userId) {
        return AppData.getUserBookMapping().get(userId);
    }
}
