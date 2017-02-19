package com.niit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest 

{

	static AnnotationConfigApplicationContext context;


	public static void main(String[] args)
	
	{
		
		System.out.println("inside main");
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		/*UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		User user=(User)context.getBean("user");
		user.setUsername("Bhavya");
		user.setPassword("Bhavya");
		user.setCpassword("Bhavya");
		user.setEmail("ss1@yahoo.com");
		user.setPhno("12345678");
		user.setEnabled("true");
		user.setRole("ROLE_ADMIN");
		userDAO.saveOrUpdate(user);
	*/
		
	}
	
}




	
	


