package com.example.services;

import jakarta.ejb.Singleton;

@Singleton
public class HelloWorldService {
    
    public String getMessage() {
        return "Hello World!";
    }

}