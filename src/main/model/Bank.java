package main.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import main.model.account.Account;
import main.model.account.Checking;
import main.model.account.impl.Taxable;


// managing accounts

public class Bank {

    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;


    public Bank() {
        this.accounts = new ArrayList<Account>();
        this.transactions = new ArrayList<Transaction>();
        
    }
        /**
         * Name: add Transaction
         * 
         * 
         * Inside the function:
         * 1. adds a new transaction object to the array list
         * 2. using collectors
         */
    public Transaction[] getTransactions(String accountId){
        // use string pipeline 
        // filter operation inside go through all transaction 
        // collectors to return everything into a list 
        // return an array of object pass in an array of type transaction 
        // array needs to be the size of the list 
        List <Transaction> list = this.transactions.stream()
        .filter((transaction)-> transaction.getId().equals(accountId))
        .collect(Collectors.toList());

        return list.toArray(new Transaction[list.size()]);
        
    }

        public Account getAccount(String transactionId){
            return accounts.stream()
            .filter((account) -> account.getId().equals(transactionId))
            .findFirst()
            .orElse(null)  ;
        }
        // clone method a copy of the account and force every child class to clone 
        public void addAccount(Account account){
        this.accounts.add(account.clone());
        }
        /**
         * Name: add Transaction
         *  @param 
         * Inside the function:
         * 1. adds a new transaction object to the array list
         */
        public void addTransaction(Transaction transaction){
        this.transactions.add(new Transaction(transaction));
    }

    // public void executeTransactions(Transaction transaction){
    //     switch(transaction.getType()){
    //         case WITHDRAW: withdrawTransaction(transaction); break;
    //         case DEPOSIT: depositTransaction(transaction); break;
    //     }
    // }
    // private void withdrawTransaction(Transaction transaction){
    //     if(getAccount(transaction.getId()).withdraw(transaction.getAmount())){
    //         addTransaction(transaction);
    //     }
    // }
    // private void depositTransaction(Transaction transaction){
    //     getAccount(transaction.getId()).withdraw(transaction.getAmount()){
    //         addTransaction(transaction);
    //     }
    // }
    // private double getIncome(Taxable account){
    //     Transaction[] transactions = getTransactions(((Checking)account).getId());

    // }


    


}
