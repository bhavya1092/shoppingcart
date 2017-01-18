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
		String hql = "from Supplier where id="+id ;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<Supplier> list = (List<Supplier>) query.list();
		
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
		List<Supplier> list = (List<Supplier>) sessionFactory.getCurrentSession().createCriteria(Supplier.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		
        t.commit();
		return list;

		
	}

	
	}
	


	