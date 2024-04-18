package com.example.events.items;

public class HelloWorldEventItem {
    
    private String message;
    private Long nanosDelay;

    
    public HelloWorldEventItem(String message, Long nanosDelay) {
        this.message = message;
        this.nanosDelay = nanosDelay;
    }

    public String getMessage() {
        return message;
    }

    public Long getNanosDelay() {
        return nanosDelay;
    }

}