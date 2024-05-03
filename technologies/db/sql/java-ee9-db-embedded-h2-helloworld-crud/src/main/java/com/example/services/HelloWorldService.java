package com.example.services;

import java.util.List;
import java.util.Objects;

import com.example.entities.HelloWorldEntity;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class HelloWorldService {

	@PersistenceContext
    private EntityManager em;
	
	public String save(HelloWorldEntity helloWorldEntity) {

		Objects.requireNonNull(helloWorldEntity.getId(), "Message requires argument 'id'");
		Objects.requireNonNull(helloWorldEntity.getMessage(), "Message requires argument 'message'");

		String result = "Message was updated";	

		try {
			deleteById(helloWorldEntity.getId());
		} catch (Exception e) {
			result = "New Message was added";
		}

		em.persist(helloWorldEntity);

		return result;

	}
	
	public HelloWorldEntity findById(Long id) {
		return em.find(HelloWorldEntity.class, id);
	}

	public List<HelloWorldEntity> findAll() {
		return em.createQuery("SELECT h FROM HelloWorldEntity h", HelloWorldEntity.class)
        .getResultList();
	}

	public String deleteById(Long id) {

        HelloWorldEntity helloWorldEntity = em.find(HelloWorldEntity.class, id);
		
		if (helloWorldEntity == null) {
			throw new RuntimeException("There is no message with id: " + id);
		} 

        em.remove(helloWorldEntity);

		return "Message was deleted"; 
	}

}