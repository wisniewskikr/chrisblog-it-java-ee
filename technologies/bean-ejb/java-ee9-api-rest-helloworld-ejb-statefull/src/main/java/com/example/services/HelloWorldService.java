package com.example.services;

import jakarta.ejb.Stateful;

@Stateful
public class HelloWorldService {
    
    public String getMessage() {
        return "Hello World!";
    }

}