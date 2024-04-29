package com.example.embeddeds;

import jakarta.persistence.Embeddable;

@Embeddable
public class MessageEmbedded {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    

}