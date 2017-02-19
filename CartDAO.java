package com.niit.shoppingbackend.Dao;

import java.util.List;
import com.niit.shoppingbackend.model.Cart;

public interface CartDAO 

{
	public boolean save(Cart cart);

	public boolean update(Cart cart);

	public boolean delete(Cart cart);

	public Cart getbyid(int id);
	
	public List<Cart> listcartproducts(int id);
	
	public int totalproducts(int id);

	public int totalprice(int id);
	
	public List<Cart> list();

}
