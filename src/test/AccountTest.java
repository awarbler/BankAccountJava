
import src.main.model.account.Loan;
import src.main.model.account.Account;
import src.main.model.account.Checking;
import src.main.model.account.Saving;
import src.test.Test;packagesrc.test;

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
         * 3.
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

}
