package com.niit.Shoppingbackend.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.niit.Shoppingbackend.modal.Product;

@Repository
public interface ProductDAO
	
	{
		
	
	    public Product getByName(String name);
	    
	    
	    public void saveOrUpdate (Product product);
		
		public void delete(int id);
		
		public Product get(int id);
		
		public List <Product> list();
		
	
		

	}

