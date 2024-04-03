package com.example.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
