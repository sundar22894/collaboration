package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transacyion.annotation.Transactional;

import com.niit.model.ProfilePicture;

@Repository("profilePicturedAO")
@Transactional
public class ProfilePictureDAOImpl implements ProfilePictureDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void save(ProfilePicture)
	{
		sessionFactory.getCurrentSession().save(profilePicture);
	}
	@Override
	public void save(ProfilePicture getProfilePicture(String loginname)
			{
		Session session=sessionFactory.openSession();
		ProfilePicture profilePicture(ProfilePicture)session.get(ProfilePicture.class,loginname
				return profilePicture;
	}

}
