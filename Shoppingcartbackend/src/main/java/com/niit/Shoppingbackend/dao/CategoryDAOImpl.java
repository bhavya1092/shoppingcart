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
import com.niit.Shoppingbackend.modal.Category;


@Repository(value ="categoryDAO")
@EnableTransactionManagement

public class CategoryDAOImpl implements CategoryDAO

{

	@Autowired
	SessionFactory sessionFactory;
		

	public CategoryDAOImpl(SessionFactory sessionFactory)
	
	{
		super();
		this.sessionFactory = sessionFactory;
	}

	public Category getByName(String name) 
	
	{
		
		
		return null;
	}
	

	public void saveOrUpdate(Category category) 
	
	{
		Session s= sessionFactory.getCurrentSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(category);
		tx.commit();

		
	}

	public void delete(int id) 
	
	{
		Category category = new Category();

		sessionFactory.getCurrentSession().delete( id);

		
	}

	public Category get(int id)
	
	{
		String hql = "from Category where id=" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Category> list = (List<Category>) query.list();
		
		if (list != null && !list.isEmpty()) 
			
		return null;
		
	}

	public List<Category> list() 
	
	{

		List<Category> list = (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;

	}

}
