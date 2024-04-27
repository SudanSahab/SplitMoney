package com.example.SplitMoney.Transactions;

import com.example.SplitMoney.Users.User;

public class Expense {
    String id;
    User payer;
    User receiver;
    Integer amount;
    Transaction transaction;
    State state;

    public Expense(String id, User payer, User receiver, Integer amount, Transaction transaction) {
        this.id = id;
        this.payer = payer;
        this.receiver = receiver;
        this.amount = amount;
        this.transaction = transaction;
    }
}
