package com.bankingapp.bankaccount;

import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;

import java.math.BigDecimal;

public abstract class BankAccount {

    public BankAccount() {
        this(0, 0, "UKNOWN");
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
//        !!! make cond must <=0
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public abstract double withdraw(double withdrawAmount) throws InvalidInputException, NegativeInputException;

    public double deposit(double depositAmount) throws InvalidInputException, NegativeInputException {

        String depositAsString = Double.toString(depositAmount);
        int decimalPlaces = depositAsString.length() - depositAsString.indexOf('.') - 1;

        if (depositAmount > 0 && decimalPlaces < 3) {
            return this.getAccountBalance() + depositAmount;
        } else {
            if (depositAmount<=0){
                throw new NegativeInputException("Deposited amount: "+depositAmount+" cannot be negative.");
            }
            else {
                throw new InvalidInputException("Deposited amount: "+depositAmount+" must have maximally 2 decimal places");
            }
//            return this.getAccountBalance();
        }

    }
}

//    public double deposit(double depositAmount) throws InvalidInputException, NegativeInputException {
//        return 0;
//    }