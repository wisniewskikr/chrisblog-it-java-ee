package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MESSAGE")
public class MessageEntity {
    
    @Id
    private Long id;

    private String message;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="helloworld_id")
    private HelloWorldEntity helloWorldEntity;
    
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

    public HelloWorldEntity getHelloWorldEntity() {
        return helloWorldEntity;
    }

    public void setHelloWorldEntity(HelloWorldEntity helloWorldEntity) {
        this.helloWorldEntity = helloWorldEntity;
    }            

}