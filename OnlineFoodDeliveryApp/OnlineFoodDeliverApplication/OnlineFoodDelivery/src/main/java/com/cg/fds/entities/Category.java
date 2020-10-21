package com.cg.fds.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	@Id
	private String catId;
	private String categoryName;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String catId, String categoryName) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
	}
	public String getCatId() {
		return catId;
	}
	public void setCatId(String catId) {
		this.catId = catId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Category [CategoryId=" + catId + ", Category Name=" + categoryName+"]";
	}
	
}
