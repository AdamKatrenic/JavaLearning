package dev.lpa;

import dev.bank.BankAccount;
import dev.bank.BankCustomer;

import java.util.List;

public class Main {

    public static void main(String[] args) {

//        BankAccount account = new BankAccount(BankAccount.AccountType.CHECKING,500);
//        System.out.println(account);

//        BankCustomer joe = new BankCustomer("Joe" , 500.00, 10000.00);
//        System.out.println(joe);

        Bank bank = new Bank(3214567);
        bank.addCustomer("Joe",500.00,10000.00);



        BankCustomer joe = bank.getCustomer("000000010000000");
        System.out.println(joe);

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING,35)){
            System.out.println(joe);
        }

        if (bank.doTransaction(joe.getCustomerId(), BankAccount.AccountType.CHECKING,-535)){
            System.out.println(joe);
        }

    }
}
