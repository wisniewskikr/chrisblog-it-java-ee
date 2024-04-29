package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MESSAGE")
public class MessageEntity {
    
    @Id
    private Long id;
    private String message;

    @OneToOne(mappedBy = "messageEntity")
    private HelloWorldEntity helloWorldEntity;    

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

    public HelloWorldEntity getHelloWorldEntity() {
        return helloWorldEntity;
    }

    public void setHelloWorldEntity(HelloWorldEntity helloWorldEntity) {
        this.helloWorldEntity = helloWorldEntity;
    }    

}