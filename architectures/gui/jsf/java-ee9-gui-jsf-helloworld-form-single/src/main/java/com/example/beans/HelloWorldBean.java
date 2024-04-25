package com.example.beans;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("helloWorldBean")
@SessionScoped
public class HelloWorldBean implements Serializable {
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {

        String message = "";

        if (name != null) {
            message = "Hello World " + name + "!";
            name = null;
        }        

        return message;
        
    }

}