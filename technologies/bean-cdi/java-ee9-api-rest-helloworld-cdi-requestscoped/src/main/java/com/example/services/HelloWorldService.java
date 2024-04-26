package com.example.services;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;

@SessionScoped
public class HelloWorldService implements Serializable {
    
    public String getMessage() {
        return "Hello World!";
    }

}