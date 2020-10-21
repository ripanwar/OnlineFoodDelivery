package com.cg.fds.service.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Address;
import com.cg.fds.entities.Restaurant;

class IRestaurantServiceImplTest {
	
	Restaurant restaurant ;
	IRestaurantServiceImpl rsi;
	Address address ;
	
	@BeforeEach
	public void setup()
	{	
		address = new Address("121","A block","sector 58","2nd","ggn","Haryana","India","122017");
		 restaurant = new Restaurant();
		rsi= new IRestaurantServiceImpl();
		restaurant.setRestaurantName("Agarwal Sweets");
		restaurant.setAddress(address);
		restaurant.setRestaurantId("121");
		restaurant.setManagerName("Puneet Agarwal");
		restaurant.setContactNumber("9560149537");
	}

	@Test
	void testAddRestaurant() {
		assertEquals(restaurant.getRestaurantName(),rsi.addRestaurant(restaurant).getRestaurantName());
	}

	@Test
	void testRemoveRestaurant() {
		assertEquals(restaurant.getRestaurantName(),rsi.removeRestaurant(restaurant).getRestaurantName());
	}

	@Test
	public void testUpdateRestaurant() {
		assertEquals(restaurant.getRestaurantName(),rsi.updateRestaurant(restaurant).getRestaurantName());
	}

	@Test
	void testViewRestaurant() {
		assertEquals(restaurant.getRestaurantName(),rsi.viewRestaurant("Agarwal Sweets").getRestaurantName());
	}

	@Test
	void testViewAllRestaurants() {
	
	}

	@Test
	void testViewNearByRestaurant() {
		
	}

	@Test
	void testViewRestaurantByItemName() {
		
	}

}
