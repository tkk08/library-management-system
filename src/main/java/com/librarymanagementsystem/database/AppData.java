package com.librarymanagementsystem.database;

import com.librarymanagementsystem.model.Book;
import com.librarymanagementsystem.model.BookLog;
import com.librarymanagementsystem.model.UserAccount;

import java.util.*;

public class AppData {
    public static Map<Integer, Book> getBookData(){
        return new HashMap<>(){{
           put(1, Book.builder().name("A Thousand Pieces Of You")
                   .author("Claudia Gray")
                   .id(1)
                   .build());
           put(2, Book.builder().id(2)
                   .name("The Last Four Things")
                   .author("Paul Hoffman").build());
           put(3, Book.builder().id(3)
                   .name("The Sum Of All Things")
                   .author("Nicole Brooks").build());
           put(4, Book.builder().id(4)
                   .name("Sea Voyager")
                   .author("J.M.Morgans").build());
           put(5, Book.builder().id(5)
                   .name("The Lord Of The Rings")
                   .author("J.R.R. Tolkien").build());
        }};
    }

    public static List<UserAccount> getUserData(){
        return new ArrayList<>(){{
            add(UserAccount.builder().userId(1).name("Trupti")
                    .address("Brivibas iela 180- 30, Riga, Latvia 1012")
                    .phoneNumber("271 1234567")
                    .email("trupti.kokamkar@accenture.com")
                    .build());
        }};
    }

    public static Map<Integer, List<BookLog>> getUserBookMapping(){
        Map<Integer, List<BookLog>> bookLogPerUser = new HashMap<>();
        List<BookLog> bookLog = new ArrayList<>(){{
            add(BookLog.builder().bookId(1).userId(1).bookOrderedOn("2023-12-03")
                    .bookValidUntil("2024-02-03")
                    .build());
            add(BookLog.builder().bookId(4).userId(1).bookOrderedOn("2023-10-03")
                    .bookValidUntil("2024-02-03")
                    .build());
            add(BookLog.builder().bookId(3).userId(1).bookOrderedOn("2024-01-03")
                    .bookValidUntil("2024-02-03")
                    .build());
        }};
        bookLogPerUser.put(1, bookLog);
        return bookLogPerUser;
    }

//    public static Map<Integer, BookStock> getBookStock(){
//        return new HashMap<>(){{
//            put(1, BookStock.builder().bookId(1).totalCopies(5).freeCopies(4).build());
//            put(2, BookStock.builder().bookId(2).totalCopies(5).freeCopies(5).build());
//            put(3, BookStock.builder().bookId(3).totalCopies(5).freeCopies(4).build());
//            put(4, BookStock.builder().bookId(4).totalCopies(5).freeCopies(5).build());
//            put(5, BookStock.builder().bookId(5).totalCopies(5).freeCopies(5).build());
//        }};
//    }

}
