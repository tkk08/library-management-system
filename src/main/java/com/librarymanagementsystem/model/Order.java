package com.librarymanagementsystem.model;

import java.util.Date;

public class Order {
    int bookId;
    int userId;
    Date orderDate;
    boolean returned;
    Date returnDate;
    int finePaid;
}
