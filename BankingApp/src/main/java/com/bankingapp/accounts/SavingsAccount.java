package com.bankingapp.accounts;

import com.bankingapp.bankaccount.BankAccount;
import com.bankingapp.exceptions.InsufficientBalanceException;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;

import java.util.Scanner;

public class SavingsAccount extends BankAccount {
    public void init() throws NegativeInputException, InvalidInputException, InsufficientBalanceException {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter your name:");
        setAccountHolderName(myObj.nextLine());
        System.out.println("Welcome to your Lloyds savings account " + getAccountHolderName());
        setAccountBalance(2000);
        menu();
    }

    public void menu() throws NegativeInputException, InvalidInputException, InsufficientBalanceException {
        System.out.println("Dear " + getAccountHolderName() + ", please select one of the options below:");
        System.out.println("1. Display balance.");
        System.out.println("2. Withdraw.");
        System.out.println("3. Deposit");
        System.out.println("4. Time travel");
        Scanner myObj = new Scanner(System.in);
        options(myObj.nextInt());
    }

    public void options(int choice) throws InvalidInputException, NegativeInputException, InsufficientBalanceException {
        Scanner myObj = new Scanner(System.in);
        int decision;

        switch (choice) {
            case (1):
                System.out.println("Dear " + getAccountHolderName() + ", your account balance is: " + getAccountBalance());
                System.out.println("Do you need to perform another action, press 1 for yes and 2 for no");
                decision = myObj.nextInt();
                if (decision == 1) menu();
                else if (decision == 2) break;
                else {
                    throw new InvalidInputException("Please only enter 1 or 2");
                }
            case (2):
                myObj = new Scanner(System.in);
                System.out.println("Dear " + getAccountHolderName() + ", please enter how much you would like to withdraw");
                System.out.println("Dear " + getAccountHolderName() + ", your new balance is: " + withdraw(myObj.nextDouble()));
                System.out.println("Do you need to perform another action, press 1 for yes and 2 for no");
                decision = myObj.nextInt();
                if (decision == 1) menu();
                else if (decision == 2) break;
                else {
                    throw new InvalidInputException("Please only enter 1 or 2");
                }
            case (3):
                myObj = new Scanner(System.in);
                System.out.println("Dear " + getAccountHolderName() + ", please enter how much you would like to deposit");
                System.out.println("Dear " + getAccountHolderName() + ", your new balance is: " + deposit(myObj.nextDouble()));
                System.out.println("Do you need to perform another action, press 1 for yes and 2 for no");
                decision = myObj.nextInt();
                if (decision == 1) menu();
                else if (decision == 2) break;
                else {
                    throw new InvalidInputException("Please only enter 1 or 2");
                }
                break;
            case (4):
                System.out.println("Functionality under maintenance...");
                break;
            default:
                System.out.println("Please pick a valid option.");
                menu();
        }
    }

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
