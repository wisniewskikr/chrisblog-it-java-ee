package com.example.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "MESSAGE")
public class MessageEntity {
    
    @Id
    private Long id;

    private String message;

    @ManyToMany(mappedBy = "messages")
    private Set<HelloWorldEntity> helloWorlds = new HashSet<>();
    
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

    public Set<HelloWorldEntity> getHelloWorlds() {
        return helloWorlds;
    }

    public void setHelloWorlds(Set<HelloWorldEntity> helloWorlds) {
        this.helloWorlds = helloWorlds;
    }          

}