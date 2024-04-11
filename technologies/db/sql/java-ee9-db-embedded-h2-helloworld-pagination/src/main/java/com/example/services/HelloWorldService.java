package com.example.services;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

import com.example.entities.HelloWorldEntity;

@Stateless
public class HelloWorldService {

    @PersistenceContext
    private EntityManager em;

    public HelloWorldEntity loadFirst() {
        
        List<HelloWorldEntity> list = em.createQuery("SELECT h FROM HelloWorldEntity h", HelloWorldEntity.class)
            .setFirstResult(2)
            .setMaxResults(1)
            .getResultList();        
        return list.get(0);

    }

}
