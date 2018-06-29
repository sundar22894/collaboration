package com.niit.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.Stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.modelBlog;

@Reposiyory("blogDAO")
@Transactional
public class BlogDAOImpl implements BlogDAO
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean addBlog(Blog blog)
	{
		try
		{
			sessionFactory.getCurrentSessiom().save(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised:"+e;)
			return false;
		}
	}
	@Override
	public boolean deleteBlog(Blog blog)
	{
		try
		{
			sessionFactory.getCurrentSession().delete(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised:'+e");
			return false;
		}
	}
	@Override
	public boolean updateBlog(Blog blog)
	{
		try
		{
			sessionFactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised:'+e");
			return false;
		}
	}
	@Override
	public Blog getBlog(int blogId)
	{
		try
		{
			sessionsession=sessionFactory.opensession();
			Blog blog=(Blog.class.blogId);
			session.close();
			return blog;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised"+e);
			Query query=session.createQuery("from Blog");
			List<Blog>;listBlogs=query.list();
			session.close();
			return listBlogs;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised"+e);
			return null;
		}
	}
	@Override
	public boolean approveBlog(int blogId){
		try
		{
			Blog blog=this.getBlog(blogId);
			blog.setStatus("A");
			sessionFactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised"+e);
			return false;
		}
	}
	@Override
	public boolean rejectBlog(int blogId){
		try
		{
			Blog blog=this.getBlog(blogId);
			blog.setStatus("NA");
			sessionFactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised"+e);
			return false;
		}
	}
	
	@Override
	public boolean incLikesBlog(int blogId){
		try
		{
			Blog blog=this.getBlog(blogId);
			blog.setLikes(blog.getLikes()+1);
			sessionFactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised:"+e);
			return false;
		}
	}
	@Override
	public boolean disLikesBlog(int blogId){
		try
		{
			Blog blog=this.getBlog(blogId);
			blog.setDisLikes(blog.getDisLikes()+1);
			sessionFactory.getCurrentSession().update(blog);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("ExceptionArised:"+e);
			return false;
		}
	}
		
			
	
		}
	}
	
}



}
