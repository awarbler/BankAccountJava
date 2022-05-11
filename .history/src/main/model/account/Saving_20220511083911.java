package src.main.main.model.account;
// child of Account 

// or inherits from Account class
// or extends the Account class 

public class Saving extends Account {
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
        // TODO
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
        // TODO
        return false;
    }
}
