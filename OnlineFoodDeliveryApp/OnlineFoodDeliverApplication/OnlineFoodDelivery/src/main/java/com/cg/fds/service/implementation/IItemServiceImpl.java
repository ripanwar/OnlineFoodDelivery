package com.cg.fds.service.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.fds.entities.Category;
import com.cg.fds.entities.Item;
import com.cg.fds.entities.Restaurant;
import com.cg.fds.repository.IItemRepository;
import com.cg.fds.repository.implementation.IItemRepositoryImpl;
import com.cg.fds.service.IItemService;
import com.cg.fds.utils.DatabaseConnection;
import com.cg.fds.utils.Validation;

public class IItemServiceImpl implements IItemService {

private IItemRepositoryImpl itemRepo=new IItemRepositoryImpl();

	public Item addItem(Item item) throws Exception {
		// TODO Auto-generated method stub
		 
		Validation.validateItem(item);
		Item returnItem = itemRepo.addItem(item);
		return returnItem;
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
