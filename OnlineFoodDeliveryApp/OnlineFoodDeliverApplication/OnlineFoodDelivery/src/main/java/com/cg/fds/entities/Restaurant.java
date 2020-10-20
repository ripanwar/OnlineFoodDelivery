package com.cg.fds.entities;

import java.util.List;

public class Restaurant {
private String restaurantId;
private String restaurantName;
private Address address;
private List<Item> itemList;
private String managerName;
private String contactNumber;
public Restaurant() {
	super();
	// TODO Auto-generated constructor stub
}
public Restaurant(String restaurantId, String restaurantName, Address address, List<Item> itemList, String managerName,
		String contactNumber) {
	super();
	this.restaurantId = restaurantId;
	this.restaurantName = restaurantName;
	this.address = address;
	this.itemList = itemList;
	this.managerName = managerName;
	this.contactNumber = contactNumber;
}
public String getRestaurantId() {
	return restaurantId;
}
public void setRestaurantId(String restaurantId) {
	this.restaurantId = restaurantId;
}
public String getRestaurantName() {
	return restaurantName;
}
public void setRestaurantName(String restaurantName) {
	this.restaurantName = restaurantName;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public List<Item> getItemList() {
	return itemList;
}
public void setItemList(List<Item> itemList) {
	this.itemList = itemList;
}
public String getManagerName() {
	return managerName;
}
public void setManagerName(String managerName) {
	this.managerName = managerName;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
@Override
public String toString() {
	return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address=" + address
			+ ", itemList=" + itemList + ", managerName=" + managerName + ", contactNumber=" + contactNumber + "]";
}



}
