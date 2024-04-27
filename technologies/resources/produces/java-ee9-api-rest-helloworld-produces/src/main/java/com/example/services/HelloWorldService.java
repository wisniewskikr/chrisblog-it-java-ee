package com.example.services;

import jakarta.enterprise.inject.Produces;

public class HelloWorldService {
    
    @Produces
    public String getMessage() {
        return "Hello World!";
    }

}