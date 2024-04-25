package com.example.beans;

import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("helloWorldBean")
@ViewScoped
public class HelloWorldBean implements Serializable {
    
    public String getMessage() {
        return "Hello World!";
    }

    public String getText() {
        return "Back";
    }

}