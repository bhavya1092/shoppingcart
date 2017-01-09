package com.niit.Shoppingbackend.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.Shoppingbackend.modal.Category;

@Repository
	public interface CategoryDAO
	
	{
		
	    public Category getByName(String name);
	    
		public void saveOrUpdate(Category category);
		
	    public void delete(int id);
	    
	    public Category get(int id);
	    
		public List<Category> list();
		
		
     }
