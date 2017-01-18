package com.niit.shoppingbackend.Dao;

import java.util.List;
import com.niit.shoppingbackend.model.User;

public interface UserDAO

{

	public boolean isValidate(String name, String password);

	public void saveOrUpdate(User user);

	public void delete(String email);

	public User get(String email);

	public List<User> list();

}
