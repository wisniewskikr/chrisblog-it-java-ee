package com.example.beans;

import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("landingBean")
@ViewScoped
public class LandingBean implements Serializable {
    
    public String getLabel() {
        return "Please tell me your name:";
    }

}