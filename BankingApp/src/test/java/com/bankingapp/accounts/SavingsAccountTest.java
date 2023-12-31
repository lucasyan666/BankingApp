package com.bankingapp.accounts;

import com.bankingapp.exceptions.InsufficientBalanceException;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTest {

    SavingsAccount account = new SavingsAccount();

    @Test
    public void withdraw_10_from_100() throws InvalidInputException, NegativeInputException, InsufficientBalanceException {
        account.setAccountBalance(100);

        double actual = account.withdraw(10);
        double expected = 90;

        assertEquals(expected, actual);
    }

    @Test
    public void deposit_10_into_100() throws InvalidInputException{

        account.setAccountBalance(100);
        double actual = account.deposit(10);
        double expected = 110;

        assertEquals(expected, actual);

    }

    @Test
    public void withdraw_110_from_100() throws InsufficientBalanceException, InvalidInputException, NegativeInputException
    {
        account.setAccountBalance(100);

        double actual = account.withdraw(110);

        assertThrows(InsufficientBalanceException.class, () -> account.withdraw(110));
    }



}