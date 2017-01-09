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
import com.niit.Shoppingbackend.modal.Supplier;



@Repository( value ="supplierDAO")
@EnableTransactionManagement

public class SupplierDAOImpl implements SupplierDAO


{
	
	@Autowired
	SessionFactory  sessionFactory;
	
	public SupplierDAOImpl(SessionFactory sessionFactory) 
	{
		super();
		this.sessionFactory = sessionFactory;
	}

	public Supplier getByName(String name) 
	
	{
	
		return null;
	}

	public void saveOrUpdate(Supplier supplier)
	
	{
		Session s= sessionFactory.getCurrentSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(supplier);
		tx.commit();
		
	}

	public void delete(int id) 
	{
		
		Supplier supplier= new Supplier();

		sessionFactory.getCurrentSession().delete( id);

	}

	public Supplier get(int id) 
	{
		String hql = "from Supplier where id=" ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Supplier> list = (List<Supplier>) query.list();
		
		if (list != null && !list.isEmpty()) 
			
		
		return null;
	}

	public List<Supplier> list() 
	
	{
		List<Supplier> list = (List<Supplier>) sessionFactory.getCurrentSession().createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;

		
	}

	
	}
	


	