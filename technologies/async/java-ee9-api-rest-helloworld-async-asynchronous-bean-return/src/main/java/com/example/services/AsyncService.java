package com.example.services;

import java.util.concurrent.Future;
import java.util.concurrent.locks.LockSupport;

import jakarta.ejb.AsyncResult;
import jakarta.ejb.Asynchronous;
import jakarta.ejb.Stateless;

@Stateless
@Asynchronous
public class AsyncService {
    
    public Future<String> displayMessageWithDelay(String message, Long delayNanos) {

        LockSupport.parkNanos(delayNanos);
        return new AsyncResult<>(message);

    }

}