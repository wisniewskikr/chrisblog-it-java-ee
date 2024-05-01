package com.example.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "HELLO_WORLD")
public class HelloWorldEntity {

    @Id
    private Long id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="message_id")
    private MessageEntity messageEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MessageEntity getMessageEntity() {
        return messageEntity;
    }

    public void setMessageEntity(MessageEntity messageEntity) {
        this.messageEntity = messageEntity;
    }                 
    
}
