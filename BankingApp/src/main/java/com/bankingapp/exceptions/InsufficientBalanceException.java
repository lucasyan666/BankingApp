package com.bankingapp.exceptions;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("You do not have enough balance in your account");
    }

    public InsufficientBalanceException(String errorMsg){
        super(errorMsg);
    }
}
