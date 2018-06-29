package com.niit.dao;

import java.util.list;
import org.hinernate.Query;
import org.hinernate.Session;
import org.hibernate.SessionFactory;
import org.springframework beans factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.BlogComment;

@Repository("blogCommentDAO")
@Transactional
public class BlogCommentDAOImpl implements BlogCommentDAO{
	@Autowired
	SessionFactory sessionFactory
	 @Override
	 public boolean add comment(BlogComment blogComment)
	 {
		 try
		 {
			 sessionFactory.getCurrentSession().save(blogComment);
			 return true;
		 }
		 catch(Exception e)
		 {
			 System.out.println("Exception Arised:"+e);
			 return false;
			 
		 }
	 }
@Override
public boolean deleteComment(BlogComment blogComment)
{ 
	try
	{
		sessionFactory getCurrentSession()delete(blogComment);
	return true;
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised"+e);
		return false;
	}
}0.2

}
@Override
public List<BlogComment> getAllComments(int blogId)
{
	try
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from BlogComment when blogId=myblogId");
		query.setParameter("myblogId",blogId);
		List<BlogComment>listBlogComments=query.list();
		return listBlogComments;
	}
	catch(Exception e)
	{
		System.out.println("Exception Arised;+e");
		return null;
	}
}
		 }
	 }


