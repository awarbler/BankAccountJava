package test;

import org.junit.Test;

import main.model.account.Account;
import main.model.account.Checking;
import main.model.account.Loan;
import main.model.account.Saving;

public class AccountTest {
    Account[] accounts;

    @Before
    public void setup() {
        /**
         * function name: setup
         * 
         * Instructions:
         * 1. before any test are run
         * 2. create a new account array in Account class
         */
        accounts = new Account[] {
                new Checking("f84c43f4", "Michael Scott", 1524.51),
                new Saving("ce07d7b3", "Saul Goodman", 2241.60),
                new Loan("4991bf71", "Phoebe Buffay", 2537.31)
        };
    }

    @Test
    // Unit Testing the behavior for withdrawing
    public void withdrawal() {

        accounts[0].withdraw(1440);
        assertEquals(84.51, accounts[0].getBalance());
    }

    @Test
    public void overDraft() {
        accounts[0].withdraw(1534.43);
        assertEquals(-15.42, accounts[0].getBalance);
    }

}
