package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("Atharva");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		//create Person object 
		
		Person person = new Person();
		person.setName("ABC");
		person.setEmail("abc@mail.com");
		person.setCno(2132344);
		
		
		Pan pan = new Pan();
		pan.setAddress("Dubai");
		
		//setting pan with specified person  
		pan.setPerson(person);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
		
		
	
			

	}

}
