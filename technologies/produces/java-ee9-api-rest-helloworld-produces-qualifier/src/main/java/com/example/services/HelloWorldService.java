package com.example.services;

import com.example.annotations.Message;
import com.example.annotations.MessageSecond;
import jakarta.enterprise.inject.Produces;

public class HelloWorldService {
    
    @Produces
    @Message
    public String getMessage() {
        return "Hello World!";
    }

    @Produces
    @MessageSecond
    public String getMessageSecond() {
        return "Hello World Second!";
    }

}