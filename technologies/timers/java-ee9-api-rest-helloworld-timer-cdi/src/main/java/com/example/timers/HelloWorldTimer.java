package com.example.timers;

import java.util.concurrent.TimeUnit;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.enterprise.concurrent.ManagedScheduledExecutorService;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldTimer {

    @Resource
    private ManagedScheduledExecutorService mses;
    
    @PostConstruct
    public void activateTimer() {
        mses.scheduleAtFixedRate(this::displayMessage, 0, 1, TimeUnit.SECONDS);
    }
    
    public void displayMessage() {
        System.out.println("Hello World from Timer!");
    }

}