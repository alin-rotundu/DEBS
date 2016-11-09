package com.debs.nullObject;

public class RealComment extends AbstractComment {

	public RealComment(long id) {
	    this.commentId = id;		
	}
	
	public long getId(){
		return this.commentId;
	}
	
	@Override
	public String getCommentContent() {
	    return content;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}
}
