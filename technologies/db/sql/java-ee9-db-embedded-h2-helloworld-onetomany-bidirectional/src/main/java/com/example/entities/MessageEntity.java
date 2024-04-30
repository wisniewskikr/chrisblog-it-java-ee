package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MESSAGE")
public class MessageEntity {
    
    @Id
    private Long id;
    private String message;
    private Long helloId;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHelloId() {
        return helloId;
    }

    public void setHelloId(Long helloId) {
        this.helloId = helloId;
    }         

}