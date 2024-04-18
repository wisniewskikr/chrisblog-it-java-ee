package com.example.events.listeners;

import com.example.events.items.HelloWorldEventItem;

import jakarta.enterprise.event.Observes;

public class HelloWorldEventListener {
    
    public void onHelloWorldEvent(@Observes HelloWorldEventItem item) {
        System.out.println(item.getMessage());
    }

}