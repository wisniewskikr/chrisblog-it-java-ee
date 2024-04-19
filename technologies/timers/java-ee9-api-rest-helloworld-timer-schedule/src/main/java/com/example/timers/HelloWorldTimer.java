package com.example.timers;

import jakarta.ejb.Schedule;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Singleton
@Startup
public class HelloWorldTimer {
    
    @Schedule(hour = "*", minute = "*", second = "*")
    public void displayMessage() {
        System.out.println("Hello World from Timer!");
    }

}