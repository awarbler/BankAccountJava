package main.model.account;
// child of Account 

// or inherits from Account class
// or extends the Account class 

public class Checking extends Account {
    // declare a private static final  an overdraft fee AS A CONSTANT
    private static final double OVERDRAFT_FEE = 5.50;

    // extends need to sync w/ parent constructor
    // parameters updated fields, checking object inherits
    public Checking(String id, String name, double balance) {
        // use super constructor
        // calling constructor in the parent class
        // updates field in current object
        super(id, name, balance);
    }

    // Create a copy constructor
    // Receive source object
    // use copy constructor from parent
    public Checking(Account source) {
        // use super constructor
        // calling constructor in the parent class
        // updates field in current object
        super(source);
    }

    @Override
    public void deposit(double amount) {
        /**
         * function name deposits
         * 
         * Inside :
         * 1. child class required to provide an override with logic
         * 2. provide logic for deposit
         * 
         */
    }

    @Override
    public boolean withdraw(double amount) {
        /**
         * function name deposits
         * 
         * Inside :
         * 1. child class required to provide an override with logic
         * 2. provide logic for withdraw
         * 
         */
        if (super.getBalance() - amount < 0) {
            super.setBalance(super.round(super.getBalance() - amount - OVERDRAFT_FEE));
            return true;
        }
        super.setBalance(super.round(super.getBalance() - amount));
        return true;
    }

}
