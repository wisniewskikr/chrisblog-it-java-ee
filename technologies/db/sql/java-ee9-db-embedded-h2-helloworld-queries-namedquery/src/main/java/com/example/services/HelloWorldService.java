package com.example.services;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import com.example.entities.HelloWorldEntity;

@Stateless
public class HelloWorldService {

    @PersistenceContext
    private EntityManager em;

    public HelloWorldEntity load(Long id) {
        return em.createNamedQuery("HelloWorldEntity.findMessageById", HelloWorldEntity.class)
            .setParameter("id", id)
            .getSingleResult();
    }

}
