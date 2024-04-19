package com.example.timers;

import java.util.concurrent.TimeUnit;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.enterprise.concurrent.ManagedScheduledExecutorService;

@Singleton
@Startup
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