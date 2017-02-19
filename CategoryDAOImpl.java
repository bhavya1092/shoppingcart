package com.niit.shoppingbackend.Dao;

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
import com.niit.shoppingbackend.model.Category;

@SuppressWarnings("deprecation")
@Repository(value ="categoryDAO")
@EnableTransactionManagement
public class CategoryDAOImpl implements CategoryDAO

{
    @Autowired
    Category  category;
	
	
    @Autowired
	SessionFactory sessionFactory;

     public CategoryDAOImpl(SessionFactory sessionFactory)
	
	{
		super();
		this.sessionFactory = sessionFactory;
		
	}
	
	
	
	@Transactional
	public Category getName(String name) 
	
	{
		
		System.out.println("Inside get category name ");
		String hql="From Category where catname=" + "'"  + name + "'";
		Transaction t= sessionFactory.getCurrentSession().beginTransaction();
		@SuppressWarnings("rawtypes")
		Query query= sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings({ "unchecked" })
		List<Category> list=query.list();
		t.commit();
		if(list==null || list.isEmpty())
		
		{
			
			return null;
			
		}		
		
		else
			
		{
			
			return list.get(0);
			
		}
		
	}
	
	   @Transactional
       public void saveOrUpdate(Category category) 
	
	{
    	   
        Session s= sessionFactory.openSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(category);
		tx.commit();


		System.out.println("adding, saving category impl");

	} 
    	
	   
	   @Transactional
		public boolean delete(Category category) 
	   
	   {
			try
			
			{
				
				System.out.println("Starting of the method delete");
				Transaction t=sessionFactory.getCurrentSession().beginTransaction();
				sessionFactory.getCurrentSession().delete(category);
				
				System.out.println("Ending of the method delete");
				t.commit();
				return true;
				}
			
			catch(Exception e)
			
			{
					System.out.println("Exception occured in delete method" + e.getMessage());
					e.printStackTrace();
					return false;
				}
		}
    
    @Transactional
	public Category get(int id)
	
	{
		String hql = "from Category where cat_id=" +id;
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		@SuppressWarnings({ "rawtypes", "deprecation" })
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Category> list = (List<Category>) query.list();
		t.commit();
		if (list != null && !list.isEmpty()) 
			
		{
			System.out.println( "get category");
			
		}
			

		return list.get(0);
		
	}
	
	
    @SuppressWarnings("unchecked")
	@Transactional
	public List<Category> list() 
	
	{
    	
    	Session s= sessionFactory.getCurrentSession();
 		Transaction t=s.beginTransaction();
 		//List<Category> list = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class)
		@SuppressWarnings("deprecation")
		List<Category> list = (List<Category>) s.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		t.commit();
		s.close();
		return list;

	}
    
    
 }

	
	
		

	


