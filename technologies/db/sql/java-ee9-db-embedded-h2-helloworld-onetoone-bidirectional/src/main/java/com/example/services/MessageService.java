package com.example.services;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.example.entities.MessageEntity;

@Stateless
public class MessageService {

    @PersistenceContext
    private EntityManager em;

    public Long save(MessageEntity messageEntity) {
        em.persist(messageEntity);
        return messageEntity.getId();
    }

    public MessageEntity load(Long id) {
        return em.find(MessageEntity.class, id);
    }

}
