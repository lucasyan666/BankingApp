package com.bankingapp.exceptions;

public class NegativeInputException extends Exception {
    public NegativeInputException(){
        super("Please enter a positive number");
    }

    public NegativeInputException(String errorMsg){
        super(errorMsg);
    }
}
