package com.cg.fds.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.fds.entities.Address;
import com.cg.fds.entities.Category;
import com.cg.fds.entities.Item;
import com.cg.fds.entities.Restaurant;
import com.cg.fds.service.IItemService;
import com.cg.fds.service.implementation.IItemServiceImpl;

public class Main {
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		IItemServiceImpl itemService=new IItemServiceImpl() ;
		Category category=new Category("1", "Italian");
		Item item=new Item();
		item.setItemId("1");
		item.setCategory(category);
		item.setCost(150);
		item.setItemName("Pizza");
		item.setQuantity(1);
		List<Item> itemList=new ArrayList<Item>();
		itemList.add(item);
		Address address=new Address("2258", "null", "Sector-12", "2", "Sonepat", "Haryana", "India", "131001");
		Restaurant res=new Restaurant("1", "BBQ", address, itemList, "Kushal", "7015451788");
		
	
	

		System.out.println(itemService.addItem(item));

	}

}
