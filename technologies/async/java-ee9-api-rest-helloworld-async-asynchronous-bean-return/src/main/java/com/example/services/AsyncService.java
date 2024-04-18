package com.example.services;

import java.util.concurrent.locks.LockSupport;

import jakarta.ejb.Asynchronous;
import jakarta.ejb.Stateless;

@Stateless
@Asynchronous
public class AsyncService {
    
    public void displayMessageWithDelay(String message, Long delayNanos) {

        LockSupport.parkNanos(delayNanos);
        System.out.println(message);

    }

}