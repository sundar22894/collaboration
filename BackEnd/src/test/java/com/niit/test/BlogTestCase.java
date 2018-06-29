package com.niit.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BlogDAO;
import com.niit.model.Blog;

public class BlogTestCase {
static BlogDAO blogDAO;

@BeforeClass
public ststic void initialize()
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	blogDAO=(BlogDAO)context.getBean("blogDAO");
}

@Ignore
@Test
public void addBlogTestCase(){
	Blog blog=new Blog();
	blog.setBlogName("Hibernate Framework");;
	blog.setBlogContext("Hibernate Framework Related Concept");
	blog.setCreateDate(new java.util.Date());
	blog.setLikes(1);
	blog.setDisLikes(1);
	blog.setLoginname("Kiran");
	blog.setStatus("NA");
	
	assertTrue("Problem in Blog Insertion",blogDAO.addBlog(blog));
}
@Ignore
@Test
pub;lic void updateBlogTestCase()
{
	Blog blog=blogDAO.getBlog(952);
	
	blog.setBlogName("JAVA SE");
	blog.setLikes(2);;
	

	assertTrue("Problem in Blog Updation",blogDAO.updateBlog(blog));
}
@Test
public void listBlogTestCase()
{
	List<Blog>listBlogs=blogDAO.listBlogs();
	assertTrue("Problem in Listing Blog",listBlog.size()>0);
	
	for(Blog blog:listBlogs)
	{
		System.out.print(blog.getBlogId()+"...");
		System.out.print(blog.getBlogName()+"...");
		System.out.print(blog.getBlogContent()+"...");
		
	}
	@Test
	public void approveBlogTestCase()
	{
		assertTrue("Problem in Approving Blog",blogDAO.approveBlog(974));
		
	}
	@Test
	public void rejectBlogTestCase()
	{
		assertTrue("Problem in Approving Blog",blogDAO.incLikes(972));
		
	}
	@Test
	public void incrementLikesBlogTestCase()
	{
		assertTrue("Problem in Incrementing Blog",blogDAO.incLikes(974));
	}
		
	
}


