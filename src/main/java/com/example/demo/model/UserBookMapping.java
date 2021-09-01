package com.example.demo.model;

import java.util.Date;

public class UserBookMapping {
    private User Uid;
    private Book Bid;
    boolean retrn;
    Date issueDate;
    Date retrnDate;

    public UserBookMapping(User uid, Book bid) {
        Uid = uid;
        Bid = bid;
    }


}
