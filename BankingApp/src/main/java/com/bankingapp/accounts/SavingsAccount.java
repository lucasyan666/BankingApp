package com.bankingapp.accounts;

import com.bankingapp.bankaccount.BankAccount;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;

public class SavingsAccount extends BankAccount {

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    private double interestRate;

    @Override
    public double withdraw(double withdrawAmount) throws InvalidInputException, NegativeInputException {
        if (withdrawAmount <= 0) throw new InvalidInputException();                             //exception if withdraw input is a negative amount
        else if ( withdrawAmount > getAccountBalance()) throw new NegativeInputException();     //exception if withdraw amount is greater than the account balance
        else {
            setAccountBalance(getAccountBalance() - withdrawAmount);
            return getAccountBalance();
        }
    }


}
