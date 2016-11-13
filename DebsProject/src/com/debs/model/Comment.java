package com.debs.model;

import java.util.Date;

public class Comment {
	
	private Long id;
	
	private Long postId;
	
	private Long userId;
	
	private Date timestamp;
	
	private String username;
	
	private String message;
	
	private Long commentReplied;
	
	private Long postCommented;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getCommentReplied() {
		return commentReplied;
	}

	public void setCommentReplied(Long commentReplied) {
		this.commentReplied = commentReplied;
	}

	public Long getPostCommented() {
		return postCommented;
	}

	public void setPostCommented(Long postCommented) {
		this.postCommented = postCommented;
	}
	
	
}
