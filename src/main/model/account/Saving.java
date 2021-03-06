package main.model.account;

// child of Account 
// or inherits from Account class
// or extends the Account class 

public class Saving extends Account {

    // declare a private static final  an overdraft fee AS A CONSTANT
    private static final double WITHDRAW_FEE = 5.50;
 
    // extends need to sync w/ parent constructor
    // parameters updated fields, checking object inherits
    public Saving(String id, String name, double balance) {
        // use super constructor
        // calling constructor in the parent class
        // updates field in current object
        super(id, name, balance);
    }

    // Create a copy constructor
    // Receive source object
    // use copy constructor from parent
    public Saving(Account source) {
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
        return new Saving(this);
    }
    @Override
    public void deposit(double amount) {
        /**
         * function name deposits
         * 
         * Inside :
         * 1. child class required to provide an override with logic
         * 2. provide logic for deposit and withdraw
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
        super.setBalance(super.round(super.getBalance() - amount - WITHDRAW_FEE));
        return true;
    }
}
