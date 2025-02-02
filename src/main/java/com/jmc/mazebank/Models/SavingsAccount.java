package com.jmc.mazebank.Models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class SavingsAccount extends Account {
    // The withdrawal limit
    private final DoubleProperty withdrawallimit;

    public SavingsAccount(String owner, String accountNumber, double balance, double withdrawalLimit) {
        super(owner, accountNumber, balance);
        this.withdrawallimit = new SimpleDoubleProperty(this, "Withdrawal Limit", withdrawalLimit) {
        };
    }

    public DoubleProperty withdrawalLimitProperty() {
        return this.withdrawallimit;
    }

    @Override
    public String toString() {
        return accountNumberProperty().get();
    }
}
