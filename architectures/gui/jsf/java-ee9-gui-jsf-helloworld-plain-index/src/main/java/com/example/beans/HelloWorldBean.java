package com.example.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="helloWorldBean")
@ViewScoped
public class HelloWorldBean {
    
    public String getMessage() {
        return "Hello World!";
    }

}