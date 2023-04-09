package com.javatechie.tx.exception;

public class InsufficientAmountException extends RuntimeException{

    public InsufficientAmountException(String message){
        super(message);
    }
}
