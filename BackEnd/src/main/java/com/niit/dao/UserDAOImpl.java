package com.niit.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.UserDetail;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean registerUser(UserDetail userDetail)
	{
		try
		{
			sessionFactory.getCurrentSession().save(userDetail);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised"+e);
			return false;
		}
		@Override
		public boolean updateUser(UserDetail userDetail)
		{
			try
			{
				sessionFactory.getCurrentSession().update(userDetail);
				return true;
			}
			catch(Exception e)
			{
				System.out.println("ExceptionArised"+e);
				return false;
			}
			@Override
			public UserDetail getuser(String loginname)
			
			{
			   Session session=sessionFactory.openSession();
			   UserDetail userDetail=(UserDetail)session.get(UserDetail.class,loginname);
			   session.clossed();
			   return userDetail;
			}
			@Override
			public UserDetail checkUser(UserDetail userDetail)
			{
				Session session=sessionFactory.openSession();
				Queryquery=session.createQuery("from UserDetail where loginname=myloginname and password=password");
				query setParameter("myloginname",userDetail.getLoginname());
				query setParameter("password",userDetail.getPassword());
				List<UserDetail>listUserDetail=query.list();
				UserDetail userDetail1=listUserDetail.get(0);
				session.close();
				return userDetail1;
				
				
			}
	}






public class UserDAOImpl {

}
