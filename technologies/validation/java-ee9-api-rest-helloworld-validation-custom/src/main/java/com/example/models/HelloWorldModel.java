package com.example.models;

import com.example.validation.annotations.MessageValidationAnnotation;

public class HelloWorldModel {
    
    @MessageValidationAnnotation
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    

}