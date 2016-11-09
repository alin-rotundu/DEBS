package com.debs.nullObject;

public abstract class AbstractComment {
	
	public String content;
	public long commentId;
	
	public abstract String getCommentContent();
	public abstract boolean isNil();
}
