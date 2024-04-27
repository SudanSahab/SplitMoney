package com.example.SplitMoney.Transactions;

/*
ACTIVE - This is a valid latest transaction
UPDATED - This transaction was updated and spawned a new transaction
DELETED - This transaction is deleted
 */
public enum State {
    ACTIVE,
    UPDATED,
    DELETED;
}
