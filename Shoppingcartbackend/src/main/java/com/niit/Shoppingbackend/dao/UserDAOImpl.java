package com.niit.Shoppingbackend.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.Shoppingbackend.modal.User;



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
		
		String hql = "from User where user_id=" + id + " and " + " username ='" + password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
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

	public User get(String email)
	
	{
	
		 return null;
       
	}
		
		

	public List<User> list() 
	
	{

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
		User user = new User();

		sessionFactory.getCurrentSession().delete(email);

	}


	public boolean isValidate(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}


	}
