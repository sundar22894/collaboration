package com.niit.test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
imort org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.dao.BlogCommentDAO {
	import com.niit.model.BlogComment;
public class BlogCommentTestCase {
	static BlogComment blogCommentDAO {
@BeforeClass
public static void initialize()
{
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	context.scan("com.niit");
	context.refresh();
	
	blogCommentDAO=(BlogCommentDAO)context.getBean("blogCommentDAO");
}
@Ignore
@Test
public void addBlogCommentTestCase()
{
	BlogComment blogComment=new BlogComment();
	blogComment.setBlogId(972);
	blogComment.setCommentDate(new java.util.date(0));
	blogComment.setloginname("rajesh");
	blogComment.setCommentDateText("Very Informative Blog");
	
	assertTrue("Problem in adding aBlog Comment",blogCommentDAO.addComment(blogComment));
}
@Test
public void listBlogCommentTestCase()
{
	  List<BlogComment> listComments=blogCommentDAO.getAllComments(974);
	  
	  assertTrue("Problem in Listing BlogComments:",listComments.size()>0);
	  
	  for(BlogComment blogComment:listComments)
	  {
		  System.out.print(blogComment.getBlogId()+"....");
		  System.out.println(blogComment.getCommentText());
	  }
	  }

	
	
	


	}
