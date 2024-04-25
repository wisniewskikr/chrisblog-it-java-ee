package com.example.beans;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("helloWorldBean")
@SessionScoped
public class HelloWorldBean implements Serializable {

    private String name;    

    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return "Hello World " + name + "!";
    }

    public String getText() {
        return "Back";
    }

}