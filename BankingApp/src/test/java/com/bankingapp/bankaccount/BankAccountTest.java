package com.bankingapp.bankaccount;

import com.bankingapp.accounts.CurrentAccount;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {

    @Test
    public void depositInt1Test() throws InvalidInputException, NegativeInputException{

        CurrentAccount currentAccTest = new CurrentAccount();

        int depositAmount=1;
        double startBalance = currentAccTest.getAccountBalance();
        double expectedBalance = startBalance + depositAmount;

        double actualBalance = currentAccTest.deposit((depositAmount));

        assertEquals(expectedBalance,actualBalance);
    }

    @Test
    public void depositInt100Test() throws InvalidInputException, NegativeInputException{

        CurrentAccount currentAccTest = new CurrentAccount();

        int depositAmount=100;
        double startBalance = currentAccTest.getAccountBalance();
        double expectedBalance = startBalance + depositAmount;

        double actualBalance = currentAccTest.deposit((depositAmount));

        assertEquals(expectedBalance,actualBalance);

    }

    @Test
    public void NegativeDepositInt100Test() throws InvalidInputException, NegativeInputException {
        final CurrentAccount currentAccTest = new CurrentAccount();

        int depositAmount=-100;

        assertThrows(NegativeInputException.class, () -> currentAccTest.deposit(depositAmount));

    }

    @Test
    public void DepositDouble10_1Test() throws InvalidInputException, NegativeInputException{
        CurrentAccount currentAccTest = new CurrentAccount();

        double depositAmount=10.1;
        double startBalance = currentAccTest.getAccountBalance();
        double expectedBalance = startBalance + depositAmount;
        double actualBalance = currentAccTest.deposit((depositAmount));
        assertEquals(expectedBalance,actualBalance);
    }

    @Test
    public void DepositDouble10_11Test() throws InvalidInputException, NegativeInputException{
        CurrentAccount currentAccTest = new CurrentAccount();

        double depositAmount=10.11;
        double startBalance = currentAccTest.getAccountBalance();
        double expectedBalance = startBalance + depositAmount;
        double actualBalance = currentAccTest.deposit((depositAmount));
        assertEquals(expectedBalance,actualBalance);
    }

    @Test
    public void DepositDouble10_111Test() throws InvalidInputException, NegativeInputException{
        CurrentAccount currentAccTest = new CurrentAccount();

        double depositAmount=10.111;

        assertThrows(InvalidInputException.class, () -> currentAccTest.deposit(depositAmount));
    }

}   