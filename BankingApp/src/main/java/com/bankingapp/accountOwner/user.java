package com.bankingapp.accountOwner;

import com.bankingapp.accounts.CurrentAccount;
import com.bankingapp.exceptions.InsufficientBalanceException;
import com.bankingapp.exceptions.InvalidInputException;
import com.bankingapp.exceptions.NegativeInputException;

/**
 * Hello world!
 *
 */
public class user
{
    public static void main( String[] args ) throws NegativeInputException, InvalidInputException, InsufficientBalanceException {
        CurrentAccount myAcc = new CurrentAccount();
        myAcc.init();
        System.out.println( "Hello World!" );
    }
}