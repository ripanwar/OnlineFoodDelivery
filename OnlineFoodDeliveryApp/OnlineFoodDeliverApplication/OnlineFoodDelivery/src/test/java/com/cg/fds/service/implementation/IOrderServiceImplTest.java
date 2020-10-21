package com.cg.fds.service.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Address;
import com.cg.fds.entities.Customer;
import com.cg.fds.entities.Item;
import com.cg.fds.entities.OrderDetails;
import com.cg.fds.entities.Restaurant;

class IOrderServiceImplTest {
	IOrderServiceImpl orderService;
	Item item;
	List<Item> itemList;
	OrderDetails order;

	@Before
	public void setup() {
		item = new Item();

		order = new OrderDetails();
		order.setOrderId(123);
		order.setOrderStatus("Approved");
		orderService = new IOrderServiceImpl();
		itemList = new ArrayList<Item>();
		itemList.add(item);
	}

	@Test
	public void addTest(OrderDetails order) {

		assertEquals(order.getOrderId(), orderService.addOrder(order).getOrderId());
		assertEquals(order.getOrderStatus(), orderService.addOrder(order).getOrderStatus());

	}

	@Test
	public void updateTest(OrderDetails order) {
		order.setOrderId(234);
		assertEquals(order.getOrderId(), orderService.updateOrder(order).getOrderId());

	}

	@Test
	public void removeTest(OrderDetails order) {
		assertEquals(null, orderService.removeOrder(order).getOrderId());

	}

	@Test
	public void viewTest(OrderDetails order) {
		assertEquals(order.getOrderId(), orderService.viewOrder(order).getOrderId());

	}

	@Test
	public void viewAllOrdersRestaurantTest(Restaurant resName) {
		Address address = new Address("2f/45", "NULL", "NIT", "5", "Faridabad", "Haryana", "India", "121001");
		Restaurant res = new Restaurant("12", "ABC", address, itemList, "Allwin", "7011578115");
	}

	@Test
	public void viewAllOrdersCustomerTest(Customer customer) {
		Address address = new Address("2f/45", "NULL", "NIT", "5", "Faridabad", "Haryana", "India", "121001");

		Customer customer1 = new Customer("456", "Allwin", "Guglani", "Male", "21", "7011578115", address,
				"abc@gmail.com");
	}
}
