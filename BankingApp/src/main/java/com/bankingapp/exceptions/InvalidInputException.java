package com.bankingapp.exceptions;

public class InvalidInputException extends Exception{
    public InvalidInputException(){
        super("We can only accept a two digit double as input :)");
    }

    public InvalidInputException(String errorMsg){
        super(errorMsg);
    }
}
