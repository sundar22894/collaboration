package com.niit.test;

import static org.junit.Assert.assertTrue;


import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.BlogCommentDAO;
import com.niit.model.Blog;
import com.niit.model.BlogComment;

public class BlogCommentTestCase
{
static BlogCommentDAO blogCommentDAO;
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	blogCommentDAO=(BlogCommentDAO)context.getBean("blogCommentDAO");
}
@Ignore
@Test
public void addBlogCommentTestCase()
{
	BlogComment blogComment=new BlogComment();
	blogComment.setBlogId(922);
	blogComment.setCommentDate(new java.util.Date());
	blogComment.setLoginname("rajesh");
	blogComment.setCommentText("Very Informative Blog");
	
	assertTrue("Problem in Adding a Blog Comment",blogCommentDAO.addComment(blogComment));
	
}
@Test
public void listBlogCommentTestCase()
{
	List<BlogComment> listComments=blogCommentDAO.getAllComments(953);
	assertTrue("Problem in Listing BlogsComments",listComments.size()>0);
	for(BlogComment blogComment:listComments)
	{
		System.out.print(blogComment.getBlogId()+":::");
		System.out.println(blogComment.getCommentText());
	}
}
}