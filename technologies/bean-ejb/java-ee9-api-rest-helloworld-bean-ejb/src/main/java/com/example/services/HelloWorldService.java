package com.example.services;

import jakarta.ejb.Stateless;

@Stateless
public class HelloWorldService {
    
    public String getMessage() {
        return "Hello World!";
    }

}