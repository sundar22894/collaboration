package com.niit config;
import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SssionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.Configuration;
import org.springframework.jdbc.database.DriveManagerDataSource;
import org.springframework.hibernate5.HibernateTransactionManager;
import org.springframework.hiberate5.localSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.model.Blog;
import com.niit.model.BlogComment;
import com.niit.model.UserDetail;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class DBConfiq
{
	//1Data Source Object
	public DataSource getDataSource()
	{
		DriverManagementDataSource=new DriverManagementDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc.oracle:thin:@localhost.OracleDriver"):
			dataSource.setUsername("socialhub");
		    dataSource.setPassword("pass123")
;
		    return dataSource;
	}
	//2 Create SessionFactory Bean
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory()
	{
		Properties hibernateProp=new Properties();
		hibernateProp.put("hibernate.hbmddl2.auto","update");
		hibernateProp.put("hibernate.dalect","org.hibernate.dialect.Oracle 10gDialect");
		
		LocalSessionFactoryBuilder sessionFactoryBuilder=new LocalSessionFactoryBuilder(getDataSource());
		sessionFactoryBuilder.addProperties(hibernateProp);
		
		sessionFactoryBuilder.addAnnotatedClass(Blog.Class);
		sessionFactoryBuilder.addAnnotatedClass(Blogcomment.Class);
		sessionFactoryBuilder.addAnnotatedClass(UserDetail.Class);
		
		SessionFactory sessionFactory=sessionFactoryBuilder.buildSessionFactory();
		System.out.println("SessionFactory Object")
	}
	@Bean
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory)
	{
		System.out.println("Hibernate Object");
		return new HibernateTransactionManager(sessionFactory);
	}
		
		    
		    
		    
		    
		    
		    
		    
		    
	}
}