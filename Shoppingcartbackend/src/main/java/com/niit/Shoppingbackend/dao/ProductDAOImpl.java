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
import com.niit.Shoppingbackend.modal.Product;
import com.niit.Shoppingbackend.modal.Supplier;

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

	public void delete(int id)
	{
		Product product= new Product();

		sessionFactory.getCurrentSession().delete( id);

		
	}

	public Product get(int id) 
	{
		String hql = "from Product where id=" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Product> list = (List<Product>) query.list();
		
		if (list != null && !list.isEmpty()) 
			
		return null;
	}

	public List<Product> list() 
	
	{
		
		List<Product> list = (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;

		
		}
	
}

	

	