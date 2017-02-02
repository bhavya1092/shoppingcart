package com.niit.shoppingbackend.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingbackend.model.User;

@Repository(value = "userDAO")
@EnableTransactionManagement

public class UserDAOImpl implements UserDAO

	
	
	{
	
	
	@Autowired
	SessionFactory sessionFactory;
	

	public UserDAOImpl(SessionFactory sessionFactory) 
	
	{
		
		super();
		this.sessionFactory = sessionFactory;
		
	}


	public boolean isValidate(int id, String password)
	
	{
		
		String hql = "from User where userid=" + id + " and " + " username ='" + password+"'";
		@SuppressWarnings({ "rawtypes" })
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<User> list = (List<User>) query.list();
		
		if (list != null && !list.isEmpty()) 
			
		{
			
			return true;
			
		}
		
		 return false;
		  
	    }

	@Transactional
	public void saveOrUpdate(User user) 
	
	{
		
		Session s= sessionFactory.getCurrentSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(user);
		tx.commit();

		
	}

	
	     @Transactional
		public User get(String email) 
		
		{
			
			/*System.out.println("inside get method");
			Session s = sessionFactory.getCurrentSession();
			Transaction t = s.beginTransaction();
			// emailid col in tab .name is string*/
			String str = "From User where email='" + email + "'";
			@SuppressWarnings("rawtypes")
			Query query = sessionFactory.getCurrentSession().createQuery(str);
			@SuppressWarnings({ "unchecked", "deprecation" })
			List<User> ulist = query.list();

			if ((ulist != null) && ulist.isEmpty()) 
			
			{
				
				System.out.println("fetch from user");
				//t.commit();

			}

			return ulist.get(0);
			
		/*Session s=sessionFactory.getCurrentSession();
			Transaction t=s.beginTransaction();
			System.out.println("inside get ");
			t.commit();
			return(User)sessionFactory.getCurrentSession().get(email,User.class);*/
			
		}
		
		 
    @Transactional
	public List<User> list() 
	
	{
    	
    	Session s= sessionFactory.getCurrentSession();
 		@SuppressWarnings("unused")
		Transaction t =s.beginTransaction();
 		//List<User> list = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<User> list = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				       .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		 return list;
		
	}

	public UserDAOImpl() 
	
	{
		super();
		
	}


	public void delete(String email) 
	
	{
		@SuppressWarnings("unused")
		User user = new User();

		sessionFactory.getCurrentSession().delete(email);

	}




	}

	


