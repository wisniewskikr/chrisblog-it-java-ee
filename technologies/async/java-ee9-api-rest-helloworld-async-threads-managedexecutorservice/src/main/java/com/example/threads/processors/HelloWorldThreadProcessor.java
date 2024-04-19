package com.example.threads.processors;

import java.util.concurrent.locks.LockSupport;

import com.example.threads.items.HelloWorldThreadItem;

import jakarta.ejb.Stateless;

@Stateless
public class HelloWorldThreadProcessor {
    
    public void onHelloWorldAction(HelloWorldThreadItem item) {
        LockSupport.parkNanos(item.getNanosDelay());
        System.out.println(item.getMessage());
    }

}