package com.debs.model;

import java.util.Date;

public class Comment extends Event{

	private Long id;

	private Long postId;

	private Long userId;

	private String username;

	private String message;

	private Long commentReplied;

	private Long postCommented;

	private Long score;

	public Comment(){

	}

	public Comment(Date timestamp, Long id, Long userId, String message, String username, Long commentReplied, Long postCommented){
		this.timestamp = timestamp;
		this.id = id;
		this.userId = userId;
		this.message = message;
		this.username = username;
		this.commentReplied = commentReplied;
		this.postCommented = postCommented;
	}

	public String getFormattedComment(){
		return this.message + " posted by " + this.username + " on " + this.timestamp; 
	}

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

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", postId=" + postId + ", userId=" + userId + ", timestamp=" + timestamp
				+ ", username=" + username + ", message=" + message + ", commentReplied=" + commentReplied
				+ ", postCommented=" + postCommented + ", score=" + score + "]";
	}
}
