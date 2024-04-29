package com.example.entities;

import com.example.embeddeds.MessageEmbedded;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HELLO_WORLD")
public class HelloWorldEntity {

    @Id
    private Long id;
    @Embedded
    private MessageEmbedded messageEmbedded;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MessageEmbedded getMessageEmbedded() {
        return messageEmbedded;
    }

    public void setMessageEmbedded(MessageEmbedded messageEmbedded) {
        this.messageEmbedded = messageEmbedded;
    }               
    
}
