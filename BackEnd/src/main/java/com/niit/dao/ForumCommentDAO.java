package com.niit.dao;

import java.util.List;

import com.niit.model.ForumComment;

public interface ForumCommentDAO
{
	public boolean addComment(ForumComment forumComment);
	public boolean deleteComment(ForumComment forumComment);
	public List<ForumComment> getAllComments(int forumId);
}