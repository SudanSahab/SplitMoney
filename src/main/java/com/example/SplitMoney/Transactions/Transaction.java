package com.example.SplitMoney.Transactions;

import com.example.SplitMoney.Users.User;

import java.util.Date;
import java.util.Map;

public class Transaction {
    String id;
    User payer;
    Map<User, Integer> receivers;
    Date createdOn;
    User createdBy;
    State state;
    public Transaction(String id, User payer, Map<User, Integer> receivers, Date createdOn, User createdBy, State state) {
        this.id = id;
        this.payer = payer;
        this.receivers = receivers;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.state = state;
    }
}
