


import com.niit.Shoppingbackend.dao.UserDAO;

public class UserTest 

{
	
	static AnnotationConfigApplicationContext context;


	public static void main(String[] args)
	
	{
		
		System.out.println("inside main");
		context = new AnnotationConfigApplicationContext();
		context.scan("com");
		context.refresh();
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		User user=(User)context.getBean("user");
		user.setUsername("s001");
		user.setPassword("1234");
		user.setConfirmpassword("1234");
		user.setEmail("ss@yahoo.com");
		user.setPhno("12345678");
		user.setEnabled("true");
		userDAO.saveOrUpdate(user);
		
	}
	
}




	
