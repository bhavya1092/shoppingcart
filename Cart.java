package com.niit.shoppingbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Cart 


{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private int quantity;
	private int price;
		
	@ManyToOne
	@JoinColumn(name="user_id",insertable=false,updatable=false)
	private User cartuser;
	private int user_id;
	
	@ManyToOne
	@JoinColumn(name="prod_id",insertable=false,updatable=false)
	private Product cartproduct;
	private int prod_id;

	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public int getQuantity() 
	{
		return quantity;
	}

	public void setQuantity(int quantity) 
	{
		this.quantity = quantity;
	}

	public int getPrice() 
	
	{
		return price;
	}

	public void setPrice(int price) 
	
	{
		this.price = price;
	}

	public User getCartuser() 
	{
		return cartuser;
	}

	public void setCartuser(User cartuser) 
	{
		this.cartuser = cartuser;
	}
	
	public Product getCartproduct() 
	
	{
		return cartproduct;
	}

	public void setCartproduct(Product cartproduct) 
	{
		this.cartproduct = cartproduct;
	}

	public int getUser_id() 
	
	{
		return user_id;
	}

	public void setUser_id(int user_id) 
	{
		this.user_id = user_id;
	}

	public int getProd_id() 
	
	{
		return prod_id;
	}

	public void setProd_id(int prod_id) 
	{
		this.prod_id = prod_id;
	}
	
	
}
