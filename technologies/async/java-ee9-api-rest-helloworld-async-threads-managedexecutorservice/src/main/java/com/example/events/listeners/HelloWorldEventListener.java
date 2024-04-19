package com.example.events.listeners;

import java.util.concurrent.locks.LockSupport;
import com.example.events.items.HelloWorldEventItem;

import jakarta.ejb.Stateless;

@Stateless
public class HelloWorldEventListener {
    
    public void onHelloWorldEvent(HelloWorldEventItem item) {
        LockSupport.parkNanos(item.getNanosDelay());
        System.out.println(item.getMessage());
    }

}