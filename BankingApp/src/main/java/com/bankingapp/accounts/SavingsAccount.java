package com.bankingapp.accounts;

import com.bankingapp.bankaccount.BankAccount;
import com.bankingapp.exceptions.InvalidInputException;

public class SavingsAccount extends BankAccount {

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    private double interestRate;
    @Override
    public double withdraw(double withdrawAmount) throws InvalidInputException
    {
        if (withdrawAmount <= 0 || withdrawAmount > getAccountBalance()) {
            throw new InvalidInputException();
        }
        else {
            setAccountBalance(this.getAccountBalance() - withdrawAmount);
            return getAccountBalance();
        }
    }
}
