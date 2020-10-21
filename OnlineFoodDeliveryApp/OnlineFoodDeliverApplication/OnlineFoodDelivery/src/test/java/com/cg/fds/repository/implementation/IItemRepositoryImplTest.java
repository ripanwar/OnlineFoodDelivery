package com.cg.fds.repository.implementation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.cg.fds.entities.Address;
import com.cg.fds.entities.Category;
import com.cg.fds.entities.Item;
import com.cg.fds.entities.Restaurant;
import com.cg.fds.repository.IItemRepository;
import com.cg.fds.service.implementation.IItemServiceImpl;

class IItemRepositoryImplTest {
	
	Item item=null;
	Category category;
	List<Item> itemList;
	IItemRepositoryImpl itemRepoImpl;

	
	@Before
	public void setup() {
		item=new Item();
		category=new Category();
		item.setItemId("1");
		item.setItemName("Pizza");
		item.setCost(150);
		category.setCatId("3");
		category.setCategoryName("Italian");
		item.setCategory(category);
		itemList=new ArrayList<Item>();
		itemList.add(item);
		itemRepoImpl=new IItemRepositoryImpl();
		
	}

	@Test
	void testAddItem() {
		assertEquals(item.getItemId(), itemRepoImpl.addItem(item).getItemId());
	}

	@Test
	void testViewItem() {
		assertEquals(item.getItemName(), itemRepoImpl.viewItem("1").getItemName());
	}

	@Test
	void testUpdateItem() {
		item.setItemId("2");
		assertEquals(item.getItemName(), itemRepoImpl.updateItem(item).getItemName());

	}

	@Test
	void testRemoveItem() {
		assertEquals(null, itemRepoImpl.removeItem("2"));
	}

	@Test
	void testViewAllItemsRestaurant() {
Address address1=new Address("2258", "NUll", "Sector-12", "2", "Sonepat", "Haryana", "India", "131001");
		
		Restaurant res=new Restaurant("10", "BBQ",address1,itemList, "Kushal", "7015451788");
		assertEquals(itemList, itemRepoImpl.viewAllItems(res));
	}

	@Test
	void testViewAllItemsCategory() {
		fail("Not yet implemented");
	}

	@Test
	void testViewAllItemsByName() {
		fail("Not yet implemented");
	}

}
