package com.jmc.mazebank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CheckingAccount extends Account{
    // The number of transactions a client is allowed to do per day.
    private final IntegerProperty transactionLimit;

    public CheckingAccount(String owner, String accountNumber, Double balance, int tLimit) {
        super(owner, accountNumber, balance);
        this.transactionLimit = new SimpleIntegerProperty(this, "Transaction Limit", tLimit);
    }

    public IntegerProperty transactionLimitProperty() {
        return this.transactionLimit;
    }

    @Override
    public String toString() {
        return accountNumberProperty().get();
    }
}
