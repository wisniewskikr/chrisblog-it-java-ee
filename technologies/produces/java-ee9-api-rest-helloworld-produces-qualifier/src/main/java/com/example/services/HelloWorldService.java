package com.example.services;

import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

public class HelloWorldService {
    
    @Produces
    @Named("message")
    public String getMessage() {
        return "Hello World!";
    }

    @Produces
    @Named("message-second")
    public String getMessageSecond() {
        return "Hello World Second!";
    }

}