package com.example.calculator_two;

public class DivisionByZeroException extends Exception{
    DivisionByZeroException(String message){
        super(message);
    }
}
