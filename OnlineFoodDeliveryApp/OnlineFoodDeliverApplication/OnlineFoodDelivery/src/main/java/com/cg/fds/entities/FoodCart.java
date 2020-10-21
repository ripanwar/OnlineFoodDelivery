package com.cg.fds.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class FoodCart {
	@Id
	private String cartId;
	@OneToOne
	private Customer customer;
	@OneToMany
	private List<Item> itemList;
	public FoodCart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FoodCart(String cartId, Customer customer, List<Item> itemList) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.itemList = itemList;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Item> getItemList() {
		return itemList;
	}
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Food Cart [Cart ID=" + cartId + ", Customer=" + customer + ", Item List=" + itemList +"]";

	}
}
