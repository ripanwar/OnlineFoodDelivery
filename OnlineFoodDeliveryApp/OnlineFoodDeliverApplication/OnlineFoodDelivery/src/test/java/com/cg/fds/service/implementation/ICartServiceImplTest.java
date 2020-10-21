package com.cg.fds.service.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Customer;
import com.cg.fds.entities.FoodCart;
import com.cg.fds.entities.Item;
import com.cg.fds.repository.implementation.ICartRepositoryImpl;

class ICartServiceImplTest {

	FoodCart cart;
	ICartServiceImpl icr;
	Customer cust;
	Item item;
	
	
	@BeforeEach
	public void setup()
	{
		cart.setCartId("123");
		cust = new Customer();
		cust.setCustomerId("2");
		cust.setGender("Male");
		cust.setAge("21");
		item = new Item();
		item.setQuantity(4);
		icr = new ICartServiceImpl();
	}
	

	@Test
	void testAddItemToCart() {
		assertEquals(cart.getCartId(),icr.addItemToCart(cart, item).getCartId());
	}

	@Test
	void testIncreaseQuantity() {
		assertEquals(cart.getCartId(),icr.increaseQuantity(cart, item, item.getQuantity()).getCartId());
		
	}

	@Test
	void testReduceQuantity() {
		assertEquals(cart.getCartId(),icr.reduceQuantity(cart, item, item.getQuantity()).getCartId());
	}

	@Test
	void testRemoveItem() {
		assertEquals(cart.getCartId(),icr.removeItem(cart, item).getCartId());
	}

	@Test
	void testClearCart() {
		assertEquals(cart.getCartId(),icr.clearCart(cart).getCartId());
	}

}
