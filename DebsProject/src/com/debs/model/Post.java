package com.debs.model;

import java.util.Date;

public class Post {
	private Long id;

	private Long userId;

	private Date timestamp;

	private String username;

	private String message;

	private Long score;
	public Post() {
	}

	public String getFormattedPost(){
		return this.message + " posted by " + this.username + " on " + this.timestamp; 
	}
	
	public Post(Date timestamp, Long id, Long userId, String message, String username){
		this.id = id;
		this.userId = userId;
		this.timestamp = timestamp;
		this.username = username;
		this.message = message;
		this.score = 0L;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getScore() {
		return score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", userId=" + userId + ", timestamp=" + timestamp + ", username=" + username
				+ ", message=" + message + ", score=" + score + "]";
	}



}
