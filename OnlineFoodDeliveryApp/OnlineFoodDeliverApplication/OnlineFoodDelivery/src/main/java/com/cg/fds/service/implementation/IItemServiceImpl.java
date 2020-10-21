package com.cg.fds.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.fds.entities.Category;
import com.cg.fds.entities.Item;
import com.cg.fds.entities.Restaurant;
import com.cg.fds.repository.IItemRepository;
import com.cg.fds.repository.implementation.IItemRepositoryImpl;
import com.cg.fds.service.IItemService;

public class IItemServiceImpl implements IItemService{
	
	@Autowired
	IItemRepository itemRepository;

	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.addItem(item);	
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
