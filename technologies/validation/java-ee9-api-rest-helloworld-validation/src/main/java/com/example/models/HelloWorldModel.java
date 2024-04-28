package com.example.models;

import jakarta.validation.constraints.NotNull;

public class HelloWorldModel {
    
    @NotNull
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    

}