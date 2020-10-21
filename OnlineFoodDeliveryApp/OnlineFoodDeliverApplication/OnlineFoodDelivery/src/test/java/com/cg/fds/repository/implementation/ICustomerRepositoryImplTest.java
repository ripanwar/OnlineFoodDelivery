package com.cg.fds.repository.implementation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Address;
import com.cg.fds.entities.Customer;


class ICustomerRepositoryImplTest {

	Customer cus = null;
	Address add = null;
	ICustomerRepositoryImpl i;
	List<Customer> customerList;
	
	@Before
	public void setup() {
		cus = new Customer();
		cus.setCustomerId("1");
		cus.setFirstName("Rishav");
		cus.setLastName("Panwar");
		cus.setGender("Male");
		cus.setAge("22");
		cus.setMobileNumber("9999875274");
		add.setAddressId("416");
		add.setBuildingName("Aravali");
		add.setArea("Jalvayu Towers");
		add.setStreetNo("56");
		add.setCity("Gurgaon");
		add.setState("Haryana");
		add.setCountry("India");
		add.setPincode("122011");
		cus.setEmail("rishav@yahoo.com");
		
		customerList = new ArrayList<Customer>();
		customerList.add(cus);
		
		i = new ICustomerRepositoryImpl();
	}
	
	@Test
	void addCategoryTest()
	{  
		assertEquals(cus.getCustomerId(),i.addCustomer(cus).getCustomerId());
		assertEquals(cus.getFirstName(),i.addCustomer(cus).getFirstName());
		assertEquals(cus.getLastName(),i.addCustomer(cus).getLastName());
		assertEquals(cus.getGender(),i.addCustomer(cus).getGender());
		assertEquals(cus.getAge(),i.addCustomer(cus).getAge());
		assertEquals(cus.getMobileNumber(),i.addCustomer(cus).getMobileNumber());
		assertEquals(cus.getEmail(),i.addCustomer(cus).getEmail());
		
	}
	@Test
	void updateCustomerTest()
	{   
		assertEquals(cus.getCustomerId(),i.updateCustomer(cus).getCustomerId());
		cus.setFirstName("Rishavv");
		
	}
	@Test
	void removeCustomerTest()
	{  
		assertEquals(null,i.removeCustomer(cus));
		
	}
	@Test
	void viewCategoryTest()
	{  
		assertEquals(cus.getCustomerId(),i.viewCustomer(1).getCustomerId());
		
	}
	@Test
	void viewAllCategoryTest()
	{  
		assertEquals(customerList,i.viewAllCustomer("ABC Resturant"));
		
	}
}
