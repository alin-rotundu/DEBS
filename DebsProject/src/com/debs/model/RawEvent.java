package com.debs.model;

import java.util.Date;

public class RawEvent {
	private Date timestamp;
	private Boolean isPost;
	private Boolean isComment;
	private String data;
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public Boolean getIsPost() {
		return isPost;
	}

	public Boolean getIsComment() {
		return isComment;
	}
	
	public String getData() {
		return data;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public void setIsPost(Boolean isPost) {
		this.isPost = isPost;
	}

	public void setIsComment(Boolean isComment) {
		this.isComment = isComment;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}
