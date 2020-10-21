package com.cg.fds.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseConnection {
	
	public EntityManager createConnection() throws Exception {
	try {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("foodDelivery");
		EntityManager em=emf.createEntityManager();
		return em;
	} catch (Exception e) {
		// TODO: handle exception
		throw new Exception();
	}
		
	}
	
	
	 
}
