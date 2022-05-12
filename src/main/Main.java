package main;

import main.model.account.Account;
import main.model.account.Checking;
import main.model.account.Saving;

// import files to main to use 

public class Main {
    // import files

    // create constructor
    public static void main(String[] args) {
        Checking checking = new Checking("000707030903804300083000770090045009","Michael Scott", 1524.51);
        Account checkingCopy = checking.clone();
        Saving savings = new Saving("499100710008004009081010907900028005","Saul Goodman", 2241.60);
        Account savingsCopy = savings.clone();


    }
}
