package com.example.threads.items;

public class HelloWorldThreadItem {
    
    private String message;
    private Long nanosDelay;

    
    public HelloWorldThreadItem(String message, Long nanosDelay) {
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