package com.debs.nullObject;

public abstract class AbstractPost {
	
	public String content;
	public long postId;
	
	public abstract String getPostContent();
	public abstract boolean isNil();
	
}
