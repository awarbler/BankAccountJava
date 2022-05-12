package main;

import main.model.account.Account;
import main.model.account.Checking;
import main.model.account.Saving;

import java.util.ArrayList;

import main.model.Bank;
import main.model.Transaction;;
// import files to main to use 

public class Main {
    static Bank bank = new Bank();

    // create constructor
    public static void main(String[] args) {
        // loop an array of accounts and add them to bank object
        Account[] accounts = new Account []{
        new Checking("000707030903804300083000770090045009","Michael Scott", 1524.51),
        new Saving("499100710008004009081010907900028005","Saul Goodman", 2241.60),
    };
    
    
    
    // loop through an array of transactions add them to the same bank object
    for (Account account : accounts){
        bank.addAccount(account);

    }
    Transaction[] transactions = new Transaction[]{
        new Transaction(Transaction.Type.DEPOSIT,694690560,"000707030903804300083000770090045009",902.92),
        new Transaction(Transaction.Type.WITHDRAW,697861440,"000707030903804300083000770090045009",912.45),
        new Transaction(Transaction.Type.WITHDRAW,694656000,"000707030903804300083000770090045009",475.27),
        new Transaction(Transaction.Type.WITHDRAW,697783680,"000707030903804300083000770090045009",695.09),
        new Transaction(Transaction.Type.WITHDRAW,694699200,"499100710008004009081010907900028005",351.73),
        new Transaction(Transaction.Type.DEPOSIT,694656000,"499100710008004009081010907900028005",497.13),
        new Transaction(Transaction.Type.WITHDRAW,697792320,"499100710008004009081010907900028005",383.4),
        new Transaction(Transaction.Type.DEPOSIT,697800960,"499100710008004009081010907900028005",401.1),
    };
    for( Transaction transaction: transactions){
        bank.addTransaction(transaction);

    }
    // get every transaction that matches 
    Transaction[] filteredTransactions = bank.getTransactions("000707030903804300083000770090045009");
}

}
