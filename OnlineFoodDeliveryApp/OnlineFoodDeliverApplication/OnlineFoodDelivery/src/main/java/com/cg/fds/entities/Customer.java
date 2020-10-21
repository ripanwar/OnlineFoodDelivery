package com.cg.fds.entities;

import java.lang.reflect.GenericDeclaration;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private String customerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String age;
	private String mobileNumber;
	private Address address;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String customerId, String firstName, String lastName, String gender, String age,
			String mobileNumber, Address address, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer [CustomerID=" + customerId + ", First Name=" + firstName + ", Last Name=" + lastName + ", Gender"+gender+", Age"+age+", Mobile No="+mobileNumber+", Address="+address+", Email="+email+"]";

	}
	
}
