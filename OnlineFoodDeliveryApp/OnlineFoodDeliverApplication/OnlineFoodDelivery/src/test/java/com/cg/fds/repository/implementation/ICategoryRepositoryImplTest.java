package com.cg.fds.repository.implementation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.cg.fds.entities.Category;


class ICategoryRepositoryImplTest {

	Category c = null;
	ICategoryRepositoryImpl i;
	List<Category> categoryList;
	
	@Before
	public void setup() {
		c = new Category();
		c.setCatId("1000");
		c.setCategoryName("Deserts");
		
		categoryList = new ArrayList<Category>();
		categoryList.add(c);
		
		i = new ICategoryRepositoryImpl();
	}
	
	@Test
	void addCategoryTest()
	{  
		assertEquals(c.getCatId(),i.addCategory(c).getCatId());
		assertEquals(c.getCategoryName(),i.addCategory(c).getCategoryName());
		
	}
	@Test
	void updateCategoryTest()
	{   
		assertEquals(c.getCatId(),i.updateCategory(c).getCatId());
		c.setCategoryName("Starters");
		
	}
	@Test
	void removeCategoryTest()
	{  
		assertEquals(null,i.removeCategory(c));
		
	}
	@Test
	void viewCategoryTest()
	{  
		assertEquals(c.getCatId(),i.viewCategory(c).getCatId());
		assertEquals(c.getCategoryName(),i.viewCategory(c).getCategoryName());
		
	}
	@Test
	void viewAllCategoryTest()
	{  
		assertEquals(categoryList,i.viewAllCategory());
		
	}
	

}
