package com.example;

import jakarta.json.bind.annotation.JsonbProperty;

public class HelloWorldModel {
    
    @JsonbProperty("message")
    private String messageString;

    public HelloWorldModel(String messageString) {
        this.messageString = messageString;
    }

    public String getMessageString() {
        return messageString;
    }

    public void setMessageString(String messageString) {
        this.messageString = messageString;
    }
    
}