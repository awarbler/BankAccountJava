package main.model.account;
// child of Account 

import main.model.account.impl.Taxable;

// or inherits from Account class
// or extends the Account class
// ADD IMPLEMENTS TO FUNCTION NAME must override all method 

public class Checking extends Account implements Taxable {
    // declare a private static final  an overdraft fee AS A CONSTANT
    private static final double OVERDRAFT_FEE = 5.50;
    // DECLARE A PRIVATE STATIC CONSTANT FOR OVERDRAFT LIMIT
    private static final double OVERDRAFT_LIMIT = 200.00;
    // constant for taxable income and tax rate

    private static final double TAXABLE_INCOME = 3000;
    private static final double TAX_RATE = 0.15;

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

    // put the clone override after the copy constructor 
    // all I have to do is type clone and tab it will fill out

    @Override
    public Account clone() {
        // create a new checking object 
        // get all object from checking which is this 
        // recursive 
        return new Checking(this);
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
        super.setBalance(super.round(super.getBalance() + amount));
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
        if (super.getBalance() - amount < OVERDRAFT_LIMIT) {
            return false;
        }
        else if (super.getBalance() - amount < 0) {
            super.setBalance(super.round(super.getBalance() - amount - OVERDRAFT_FEE));
            return true;
        } else{
            super.setBalance(super.round(super.getBalance() - amount));
        return true;

        }
        
    }
    @Override
    public void tax(double income){
        double tax = Math.max(0, income - TAXABLE_INCOME) * TAX_RATE;
        super.setBalance(super.round(super.getBalance() - tax));
    }

}
