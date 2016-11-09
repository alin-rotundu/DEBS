package com.debs.nullObject;

public class RealPost extends AbstractPost {

	public RealPost(long id) {
	    this.postId = id;		
	}
	   
	@Override
	public String getPostContent() {
	    return content;
	}
	
	@Override
	public boolean isNil() {
		return false;
	}

	public long getId(){
		return this.postId;
	}
	
}
