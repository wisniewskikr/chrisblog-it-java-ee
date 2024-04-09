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
        return (HelloWorldEntity) em.createQuery("SELECT h FROM HelloWorldEntity h WHERE h.id=:id")
            .setParameter("id", id)
            .getSingleResult();
    }

}
