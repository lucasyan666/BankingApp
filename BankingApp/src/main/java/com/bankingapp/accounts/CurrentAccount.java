package com.bankingapp.accounts;

import com.bankingapp.bankaccount.BankAccount;
import com.bankingapp.exceptions.InvalidInputException;

public class CurrentAccount extends BankAccount {

    @Override
    public double withdraw(double withdrawAmount) throws InvalidInputException {
        if (withdrawAmount <= 0 || withdrawAmount > getAccountBalance()) throw new InvalidInputException();
        else return getAccountBalance();
    }
}
