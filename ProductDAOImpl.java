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
import com.niit.shoppingbackend.model.Product;

@Repository(value ="productDAO")
@EnableTransactionManagement

public class ProductDAOImpl implements ProductDAO

{
	
	
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory) 
	
	{
		super();
		this.sessionFactory = sessionFactory;
		
	}

	public Product getByName(String name)
	
	{
	
		return null;
		
	}

	public void saveOrUpdate(Product product)
	
	{
		
		Session s= sessionFactory.getCurrentSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(product);
		tx.commit();
		
	}

	@Transactional
	public boolean delete(Product product) 
	
	{
		
		try
		
		{
			System.out.println("Starting of the method delete");
			Transaction t=sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().delete(product);
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

	public Product get(int id) 
	
	
	{
		Session s= sessionFactory.openSession();
		//Transaction tx=s.beginTransaction();
        String hql = "from Product where prod_id=" +id;
		@SuppressWarnings("rawtypes")
		Query query = s.createQuery(hql);
		System.out.println(hql);
		@SuppressWarnings({ "unchecked", "deprecation" })
		//List<Product> list = (List<Product>) query.list();
		List<Product> list=query.list();
		//tx.commit();
		if (list == null)
			
		{
			return null;
			
		}
		else
			
		{
			
		System.out.println("inside get");	
		return list.get(0);
		
		}
	}
	
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Transactional
	public List<Product> list() 
	
	{
		
		
		Session s=sessionFactory.openSession();
		Transaction t=s.beginTransaction();
		//List<Product> list = (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
			List<Product>list=(List<Product>)s.createCriteria(Product.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			
			t.commit();
		    return list;

		
		}
	
}

	

	
	


