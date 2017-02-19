package com.niit.shoppingbackend.Dao;

import java.util.List;
import com.niit.shoppingbackend.model.Product;

public interface ProductDAO

{
	    public Product getByName(String name);
	    
	    public void saveOrUpdate (Product product);
		
		public boolean  delete(Product product);
		
		public Product get(int id);
		
		public List <Product> list();
		
}
