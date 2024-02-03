package com.librarymanagementsystem.service;

import com.librarymanagementsystem.database.AppData;
import com.librarymanagementsystem.dto.BookLogDTO;
import com.librarymanagementsystem.model.Book;
import com.librarymanagementsystem.model.BookLog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    public List<Book> getBooks(){
        return AppData.getBookData().values().stream().toList();
    }

    public List<BookLogDTO> getBooksInUseByUser(int userId) {
        List<BookLog> userBookMapping = AppData.getUserBookMapping().get(userId);
        return userBookMapping.stream().map(userBook -> {
                Book book = AppData.getBookData().get(userBook.getBookId());
                return BookLogDTO.builder()
                        .id(book.getId())
                        .name(book.getName())
                        .author(book.getAuthor())
                        .bookOrderedOn(userBook.getBookOrderedOn())
                        .bookValidUntil(userBook.getBookValidUntil())
                        .bookSubmissionDate(userBook.getBookSubmissionDate())
                        .build();
                }).toList();
    }
}
