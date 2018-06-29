package com.niit.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigurationApplicationContext;
import com.niit.dao.BlogDAO;
import com.niit.dao.UserDAO;
import com.niit.model.UserDetail;

public class UserDAOTestCase {
static UserDAO userDAO;

   @BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	userDAO=(UserDAO)context.getBean("userDAO");
}
   @Ignore
   @Test
   public void registerUserTestCase()
   {
	   UserDetail userDetail=new UserDetail(0;)
			   
		userDetail.setLoginname("rajesh");
	    userDetail.setPassword(pass123");
	    userDetail.setUsername("Rajesh Kumar");
	    userDetail.setEmailid("rajesh@gmail.com");
	    userDetail.setRole("ROLE_USER");		
       userDetail.setAddress("Hyderbad");
       userDetail.setMobile("9988987755");
       assertTrue("Problem in Registering the User:";userDAO.registerUser(userDetail));
   }
   @Ignore
   @Test
   public void updateUserTestCase()
   {
	   UserDetail.userDetail=userDAO.getUser("rajesh");
	   userDetail.setMobile("9988987755");
	   
	   assertTrue("Problem in Updating User:";userDAO.updateUser(userDetail));
   }
   
   }
@Test
public void checkLogintestTestCase()
{
	   UserDetail userDetail=new UserDetail();
			   
		userDetail.setLoginname("rajesh");
	    userDetail.setPassword(pass123");
	    userDetail userDetail1=userDAO checjUser(userDetail);
	    assertNotNull("Problem in loginCheck",userDetail);
	    
	    System.out.println("User Name:"+userDetail1.getUsername());
}


}
