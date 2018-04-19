package org.aditya.techhunt.shoppingbackend.dao;

import java.util.List;

import org.aditya.techhunt.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	public List<Category> list();

	public Category get(int id);

}
