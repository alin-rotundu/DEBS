package com.debs.dao;

import java.util.List;

import com.debs.nullObject.*;

public interface CommentDao {
	public List<RealComment> getAllComments();
	public RealComment getComment(long commentId);
	public void updateComment(RealComment comment);
	public void deleteComment(RealComment comment);
}
