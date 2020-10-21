package com.cg.fds.service.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Category;
import com.cg.fds.entities.Item;
import com.cg.fds.repository.implementation.IItemRepositoryImpl;

class IItemServiceImplTest {
	Item item;
	Category category;
	List<Item> itemList;
	IItemServiceImpl itemServImpl;

	@BeforeEach
	public void setup() {
		item = new Item();
		category = new Category();
		itemList = new ArrayList<Item>();
		item.setItemId("1");
		item.setItemName("Pizza");
		item.setCost(150);
		category.setCatId("3");
		category.setCategoryName("Italian");
		item.setCategory(category);
		itemList.add(item);
		itemServImpl = new IItemServiceImpl();
	}

	@Test
	void testAddItem() throws Exception {

		assertEquals(item.getItemId(), itemServImpl.addItem(item).getItemId());
	}

	@Test
	void testViewItem() {
		
	}

	@Test
	void testUpdateItem() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveItem() {
		fail("Not yet implemented");
	}

	@Test
	void testViewAllItemsRestaurant() {
		fail("Not yet implemented");
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
