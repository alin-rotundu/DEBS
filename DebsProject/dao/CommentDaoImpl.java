package com.debs.dao;

import java.util.List;

import com.debs.nullObject.RealComment;

public class CommentDaoImpl implements CommentDao {

	List<RealComment> comments;
	
	@Override
	public List<RealComment> getAllComments() {
		return comments;
	}

	@Override
	public RealComment getComment(long commentId) {
		for(RealComment rc : comments) { 
			   if(rc.getId() == commentId) { 
			       return rc;
			   }
			}
		return null;
	}

	@Override
	public void updateComment(RealComment comment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(RealComment comment) {
		// TODO Auto-generated method stub
		
	}

}
