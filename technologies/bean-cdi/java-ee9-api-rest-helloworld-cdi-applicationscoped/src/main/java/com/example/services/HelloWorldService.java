package com.example.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldService {
    
    public String getMessage() {
        return "Hello World!";
    }

}