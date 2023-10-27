package com.bankingapp.accounts;

import com.bankingapp.exceptions.InsufficientBalanceException;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CurrentAccountTest {

    CurrentAccount newAcc = new CurrentAccount();
    @Test
    @DisplayName("Testing withdraw")
    public void withdraw10pound20pence() throws NegativeInputException, InsufficientBalanceException {
        double balance = 100;
        double withdrawAmount = 10.20;
        double expectedResult = balance-withdrawAmount;
        double actualResult = newAcc.withdraw(withdrawAmount);
        assertEquals(expectedResult, actualResult);
    }
}