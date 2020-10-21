package com.cg.fds.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Configurable;
@Configurable
public class DatabaseConnection {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("foodDelivery");
	EntityManager em = emf.createEntityManager();
	
	public EntityManager createConnection() throws Exception {
		try {
			return em;
		} catch (Exception e) {
			// TODO: handle exception
			throw new EntityNotFoundException();
		}

	}

}
