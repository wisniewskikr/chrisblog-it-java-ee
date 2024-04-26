package com.example.services;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class HelloWorldService {
    
    public String getMessage() {
        return "Hello World!";
    }

}