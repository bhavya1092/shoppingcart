package com.niit.shoppingbackend.Dao;

import java.util.List;
import com.niit.shoppingbackend.model.Category;

public interface CategoryDAO

{
	
	public Category getName(String name);
    
	public void saveOrUpdate(Category category);
	
    public boolean delete(Category category);
    
    public Category get(int id);
    
	public List<Category> list();
	
	
}
