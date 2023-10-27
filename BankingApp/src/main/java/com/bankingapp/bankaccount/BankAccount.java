package com.bankingapp.bankaccount;

import com.bankingapp.exceptions.InsufficientBalanceException;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;

public abstract class BankAccount {

    public BankAccount(){
        this(0,0,"UKNOWN");
    }

    public BankAccount(double accountBalance, double minimumBalance, String accountHolderName) {
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    private double accountBalance;
    private double minimumBalance;
    private String accountHolderName;



    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public abstract double withdraw(double withdrawAmount) throws InvalidInputException, NegativeInputException, InsufficientBalanceException;

    public double deposit(double depositAmount) {
        if (depositAmount > 0) {
            return this.getAccountBalance() + depositAmount;
        } else {
            System.out.println(depositAmount + " is either negative or zero so cannot be deposited.");
            return this.getAccountBalance();
        }

//    public double deposit(double depositAmount) throws InvalidInputException, NegativeInputException {
//        return 0;
//    }
    }
}
