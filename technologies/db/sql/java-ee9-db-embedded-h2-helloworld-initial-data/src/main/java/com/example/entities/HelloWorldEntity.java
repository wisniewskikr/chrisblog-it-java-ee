package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HELLO_WORLD")
public class HelloWorldEntity {

    @Id
    private Long id;
    private String message;

    public HelloWorldEntity() {}

    public HelloWorldEntity(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }    
    
}
