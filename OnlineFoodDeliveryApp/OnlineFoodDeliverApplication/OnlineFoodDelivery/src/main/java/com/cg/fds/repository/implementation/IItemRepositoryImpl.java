package com.cg.fds.repository.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

import com.cg.fds.entities.Category;
import com.cg.fds.entities.Item;
import com.cg.fds.entities.Restaurant;
import com.cg.fds.repository.IItemRepository;
import com.cg.fds.utils.DatabaseConnection;

import oracle.jdbc.driver.DatabaseError;

public class IItemRepositoryImpl implements IItemRepository {

	private EntityManager em;
	
	DatabaseConnection dbConnect=new DatabaseConnection();

	

	public Item addItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		em=dbConnect.createConnection();
		em.getTransaction().begin();
		em.persist(item);
		
		return item;

	}

	public Item viewItem(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Item updateItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	public Item removeItem(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> viewAllItems(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> viewAllItems(Category cat) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Item> viewAllItemsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
