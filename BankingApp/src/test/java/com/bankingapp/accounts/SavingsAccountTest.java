package com.bankingapp.accounts;

import com.bankingapp.exceptions.InvalidInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount account = new SavingsAccount();

    @Test
    public void withdraw_10_from_100() throws InvalidInputException {
        account.setAccountBalance(100);
        account.withdraw(10);

        double actual = account.getAccountBalance();
        double expected = 90;

        assertEquals(expected, actual);
    }

    public void deposit_10_into_100() throws InvalidInputException{

        account.setAccountBalance(100);
        account.deposit(10);

    }



}