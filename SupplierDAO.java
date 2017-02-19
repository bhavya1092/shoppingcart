package com.niit.shoppingbackend.Dao;

import java.util.List;
import com.niit.shoppingbackend.model.Supplier;

public interface SupplierDAO

{
	    
	    public Supplier getByName(String name);
	    
		public void saveOrUpdate(Supplier supplier);
		
		public boolean delete(Supplier supplier);
		
		public Supplier get(int id);
		
		public List<Supplier> list();

}
