package com.example.events.listeners;

import java.util.concurrent.locks.LockSupport;

import com.example.events.items.HelloWorldEventItem;

import jakarta.ejb.Asynchronous;
import jakarta.ejb.Stateless;
import jakarta.enterprise.event.Observes;

@Stateless
@Asynchronous
public class HelloWorldEventListener {
    
    public void onHelloWorldEvent(@Observes HelloWorldEventItem item) {
        LockSupport.parkNanos(item.getNanosDelay());
        System.out.println(item.getMessage());
    }

}