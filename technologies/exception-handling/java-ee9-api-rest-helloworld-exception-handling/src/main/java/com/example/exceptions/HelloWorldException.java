package com.example.exceptions;

import jakarta.ejb.ApplicationException;

@ApplicationException
public class HelloWorldException extends RuntimeException {
    
    public HelloWorldException(String massage) {
        super(massage);
    }

}