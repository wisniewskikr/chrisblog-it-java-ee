package com.example.services;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import com.example.entities.HelloWorldEntity;

@Stateless
public class HelloWorldService {

    @PersistenceContext
    private EntityManager em;

    public Long save(HelloWorldEntity helloWorldEntity) {
        em.persist(helloWorldEntity);
        return helloWorldEntity.getId();
    }

    public HelloWorldEntity load(Long id) {
        return em.find(HelloWorldEntity.class, id);
    }

}
