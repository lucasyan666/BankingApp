package com.bankingapp.exceptions;

public class InvalidMinimuBalance extends Exception {

    public NegativeInputException(){
        super("Please enter a negative number");
    }
    

}
