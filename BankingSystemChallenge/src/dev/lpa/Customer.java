package dev.lpa;

import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions;

    public Customer(String name,double initialTransaction) {
        this.name = name;
        transactions = new ArrayList<>();
        transactions.add(initialTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double amount) {
        transactions.add(amount);
    }
}
