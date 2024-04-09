package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "HELLO_WORLD")
@NamedQuery(name = "HelloWorldEntity.findMessageById", query = "SELECT h FROM HelloWorldEntity h WHERE h.id=:id")
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
