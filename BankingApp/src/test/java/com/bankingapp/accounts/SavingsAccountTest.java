package com.bankingapp.accounts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount account = new SavingsAccount();
    @Test
    public void withdraw_10_from_100()
    {
        double withdraw = 10;
        double expected = 90;

        double actual = SavingsAccount.withdraw(withdraw);

        assertEquals(expected, actual);
    }
   @Test
    public void withdraw_100_from_100()
    {
        double savingBal = 100;
        double withdraw = 100;
        //expected is returned balance
        double expected = 0;

        double actual = SavingsAccount.withdraw(withdraw);

        assertEquals(expected, actual);
    }


}