package test;

import org.junit.Test;

import main.model.Transaction;

public class TransactionTest {
    Transaction transacton;

    @Before 
    public void setup(){
        transacton = new Transaction.WITHDRAW, 1546905600,"6B6666222",624.99);
    }
    @Test
    public void correctionDateTest(){
        assertEquals("07-01-2019", transaction.returnDate());
    }   
}
