package com.niit.shoppingbackend.Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.shoppingbackend.model.Supplier;


@Repository (value="supplierDAO")
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
		
	Session s=sessionFactory.getCurrentSession();
	Transaction tx=s.beginTransaction();
	String hql ="from Supplier where sup_name=" + "'" + name + "'";
	@SuppressWarnings("rawtypes")
	Query query=s.createQuery(hql);
	@SuppressWarnings({ "unchecked", "deprecation" })
	List<Supplier> list = (List<Supplier>) query.list();
	tx.commit();
	
	if(list !=null && !list.isEmpty())
	
	{
		
		return list.get(0);
	}
	
		return null;
	}

	public void saveOrUpdate(Supplier supplier)
	
	{
		Session s= sessionFactory.getCurrentSession();
		Transaction tx=s.beginTransaction();
		s.saveOrUpdate(supplier);
		tx.commit();
		
	}
     
	@Transactional
	public boolean delete(Supplier supplier) 
	
	{

		try 
		
		{

			Session s = sessionFactory.openSession();
			Transaction t = s.beginTransaction();

			// sessionFactory.getCurrentSession().delete(product);
			s.delete(supplier);
			System.out.println("delete supplier");

			t.commit();

			return true;
		}
		
		catch (HibernateException e) 
		
		{
			e.printStackTrace();
			return false;
		}

	}

	public Supplier get(int id) 
	{
		String hql = "from Supplier where sup_id="+id ;
		@SuppressWarnings("rawtypes")
		Transaction t=sessionFactory.getCurrentSession().beginTransaction();
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Supplier> list = (List<Supplier>) query.list();
		t.commit();
		if (list != null && !list.isEmpty()) 
		{
			
		}
		
		return list.get(0);
	}

	@Transactional
	public List<Supplier> list() 
	
	{
		
		Session s=sessionFactory.getCurrentSession();
 		Transaction t=s.beginTransaction();
 		//List<Supplier> list = (List<Supplier>) sessionFactory.getCurrentSession().createCriteria(Supplier.class)
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<Supplier> list = (List<Supplier>) sessionFactory.getCurrentSession().createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		
        t.commit();
		return list;

		
	}

	
	}
	


	