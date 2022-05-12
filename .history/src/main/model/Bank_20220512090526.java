package main.model;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;

import main.model.account.Account;

// managing accounts


public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;


    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
    }
// clone method a copy of the account and force every child class to clone 
    public void addAccount(Account account){
        // call whatever class we are using checking saving loan 
        // return a copy of the clone account 
        this.accounts.add(account.clone());
    }


}
