package com.bankingapp.bankaccount;

import com.bankingapp.accounts.CurrentAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {

    @Test
    public void depositInt1Test(){
        CurrentAccount currentAccTest = new CurrentAccount();

        int depositAmount=1;
        double startBalance = currentAccTest.getAccountBalance();
        double expectedBalance = startBalance + depositAmount;

        double actualBalance = currentAccTest.deposit((depositAmount));

        assertEquals(expectedBalance,actualBalance);
    }

    @Test
    public void depositInt100Test(){
        CurrentAccount currentAccTest = new CurrentAccount();

        int depositAmount=100;
        double startBalance = currentAccTest.getAccountBalance();
        double expectedBalance = startBalance + depositAmount;

        double actualBalance = currentAccTest.deposit((depositAmount));

        assertEquals(expectedBalance,actualBalance);

    }

    @Test
    public void NegativeDepositInt100Test(){
        CurrentAccount currentAccTest = new CurrentAccount();

        int depositAmount=100;
        double startBalance = currentAccTest.getAccountBalance();
        double expectedBalance = startBalance;
        double actualBalance = currentAccTest.deposit((depositAmount));
        assertEquals(expectedBalance,actualBalance);
    }


}