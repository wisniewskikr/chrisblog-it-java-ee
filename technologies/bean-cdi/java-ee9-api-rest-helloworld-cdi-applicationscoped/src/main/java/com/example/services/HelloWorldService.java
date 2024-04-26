package com.example.services;

import jakarta.enterprise.context.Dependent;

@Dependent
public class HelloWorldService {
    
    public String getMessage() {
        return "Hello World!";
    }

}