package com.niit.shoppingbackend.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.niit.shoppingbackend.Dao.CategoryDAO;
import com.niit.shoppingbackend.Dao.CategoryDAOImpl;
import com.niit.shoppingbackend.Dao.ProductDAO;
import com.niit.shoppingbackend.Dao.ProductDAOImpl;
import com.niit.shoppingbackend.Dao.SupplierDAO;
import com.niit.shoppingbackend.Dao.SupplierDAOImpl;
import com.niit.shoppingbackend.Dao.UserDAO;
import com.niit.shoppingbackend.Dao.UserDAOImpl;
import com.niit.shoppingbackend.model.Category;
import com.niit.shoppingbackend.model.Product;
import com.niit.shoppingbackend.model.Supplier;
import com.niit.shoppingbackend.model.User;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class Applicationcontextconfig 


{
	
//private org.hibernate.cfg.Configuration sessionBuider;

@Bean(name = "dataSource")
public DataSource getDataSource() 

{
	BasicDataSource dataSource = new BasicDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/Bhavyadb");
	dataSource.setUsername("sa");
	dataSource.setPassword("");
	System.out.println("data source");
	return dataSource;
}

private Properties getHibernateProperties()

{
	Properties properties = new Properties();
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
	properties.put("hibernate.hbm2ddl.auto", "update");
	// treat every session as a thread
	properties.put("hibernate.current_session_context_class", "thread");
	System.out.println("hibernate properties");
	return properties;
	
}

@Autowired
@Bean(name ="sessionFactory")
public SessionFactory getSessionFactory(DataSource dataSource) 

{

	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
	sessionBuilder.addProperties(getHibernateProperties());
	sessionBuilder.addAnnotatedClass(User.class);
    sessionBuilder.addAnnotatedClass(Supplier.class);
    sessionBuilder.addAnnotatedClass(Category.class);
    sessionBuilder.addAnnotatedClass(Product.class);
    System.out.println(" session factory ");
	return sessionBuilder.buildSessionFactory();
	
	
}


@Autowired
@Bean(name ="transactionManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) 

{
	
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	System.out.println("transaction ");
	return transactionManager;
}

// User

   @Autowired
   @Bean(name = "userDAO")
  public UserDAO getUserDetailsDAO(SessionFactory sessionFactory) 
  
  {
  
  System.out.println("user dao wired "); 
  return new UserDAOImpl(sessionFactory);
  
  }
  
  @Autowired
  @Bean(name = "user")
  public User getUserDetails() 
  
  {
	  
  System.out.println("user wired");
  return new User(); 
  
  }
  
  @Autowired
  @Bean(name = "categoryDAO")
		public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) 
  
  {
  
  System.out.println("category dao wired "); 
  return new CategoryDAOImpl(sessionFactory);
  
  }
  
  @Autowired
  @Bean(name = "category")
  public Category geCategoryDetails() 
  
  {
	  
  System.out.println("category wired");
  return new Category(); 
  
  }

  @Autowired
  @Bean(name = "supplerDAO") 
	  public SupplierDAO getSupplierDetailsDAO(SessionFactory sessionFactory) 
  
  {
  
  System.out.println("supplier dao wired "); 
  return new SupplierDAOImpl(sessionFactory);
  
  }
  
  @Autowired
  @Bean(name = "supplier")
  public Supplier getSupplierDetails() 
  
  {
	  
  System.out.println("user wired");
  return new Supplier();
  
  }

  @Autowired
  @Bean(name = "productDAO") 
	  public ProductDAO getProductDAO(SessionFactory sessionFactory) 
  
  {
  
  System.out.println("product dao wired "); 
  return new ProductDAOImpl(sessionFactory);
  
  }
  
  @Autowired
  @Bean(name = "product")
  public Product getProductDetails() 
  
  {
	  
  System.out.println("productr wired");
  return new Product();
  
  }
		 
  
}


