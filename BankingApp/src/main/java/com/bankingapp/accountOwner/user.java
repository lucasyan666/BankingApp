package com.bankingapp.accountOwner;

import com.bankingapp.accounts.CurrentAccount;
import com.bankingapp.accounts.SavingsAccount;
import com.bankingapp.exceptions.InsufficientBalanceException;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;

import java.util.Scanner;

public class user
{
    public static void main( String[] args ) throws NegativeInputException, InvalidInputException, InsufficientBalanceException {
        Scanner myObj = new Scanner(System.in);
        CurrentAccount myCurrentAcc = new CurrentAccount();
        SavingsAccount mySavingAcc = new SavingsAccount();
        System.out.println("Welcome to Lloyds bank, press 1 to access your current account, press 2 to access your savings account");
        int acc = myObj.nextInt();
        switch (acc){
            case (1):
                myCurrentAcc.init();
                break;
            case(2):
                mySavingAcc.init();
                break;
            default:
                System.out.println("Please enter 1 or 2 only");
        }
    }
}